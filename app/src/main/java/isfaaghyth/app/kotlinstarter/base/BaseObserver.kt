package isfaaghyth.app.kotlinstarter.base

/**
 * Created by isfaaghyth on 11/8/17.
 * github: @isfaaghyth
 */
interface BaseObserver<M> {
    fun onSuccess(model: M)
    fun onError(err: String)
    fun onComplete()
}