package isfaaghyth.app.kotlinstarter.base

import isfaaghyth.app.kotlinstarter.network.NetworkClient
import isfaaghyth.app.kotlinstarter.network.Routes
import rx.Observable
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
open class BasePresenter<V> {
    protected var view: V?=null
    protected var service: Routes?=null
    var compositeSubscription: CompositeSubscription?=null
    var subscriber: Subscriber<*>?=null

    fun attachView(view: V) {
        this.view = view
        service = NetworkClient.instance.create(Routes::class.java)
    }

    fun dettachView() {
        this.view = view
        if (compositeSubscription != null && compositeSubscription!!.hasSubscriptions())
            compositeSubscription!!.unsubscribe()
            stopSubscribe()
    }

    fun subscribe(observable: Observable<*>, subscriber: Subscriber<*>) {
        this.subscriber = subscriber
        if (compositeSubscription == null)
            compositeSubscription = CompositeSubscription()

        compositeSubscription!!.add(observable
                .observeOn(Schedulers.newThread())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe {subscriber})
    }

    fun stopSubscribe() {
        if (subscriber != null)
            subscriber!!.unsubscribe()
    }
}