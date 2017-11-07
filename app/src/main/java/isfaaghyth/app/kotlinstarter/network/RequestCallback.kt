package isfaaghyth.app.kotlinstarter.network

import io.reactivex.observers.DisposableObserver

/**
 * Created by isfaaghyth on 11/8/17.
 * github: @isfaaghyth
 */
abstract class RequestCallback<M>: DisposableObserver<M>() {

    abstract fun onSuccess(result: M)
    abstract fun onFailure(err: String)
    abstract fun onFinish()

    override fun onNext(result: M) {
        onSuccess(result)
    }

    override fun onError(e: Throwable?) {
        e!!.message?.let { it1 -> onFailure(it1) }
    }

    override fun onComplete() {
        onFinish()
    }

}