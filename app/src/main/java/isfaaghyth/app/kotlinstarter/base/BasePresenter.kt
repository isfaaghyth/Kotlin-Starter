package isfaaghyth.app.kotlinstarter.base

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import isfaaghyth.app.kotlinstarter.network.NetworkClient
import isfaaghyth.app.kotlinstarter.network.Routes
import io.reactivex.Observable
import io.reactivex.observers.ResourceObserver

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
open class BasePresenter<V> {
    protected var view: V?=null
    protected var service: Routes?=null
    var compositeDisposable: CompositeDisposable?=null

    fun attachView(view: V) {
        this.view = view
        service = NetworkClient.instance.create(Routes::class.java)
    }

    fun dettachView() {
        this.view = view
        if (compositeDisposable != null)
            compositeDisposable!!.clear()
            stopSubscribe()
    }

    fun subscribe(observable: Observable<*>, resources: ResourceObserver<*>) {
        if (compositeDisposable == null)
            compositeDisposable = CompositeDisposable()

        compositeDisposable!!.add(observable
                .subscribeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({resources}))
    }

    fun stopSubscribe() {
        if (compositeDisposable != null)
            compositeDisposable!!.clear()
    }
}