package isfaaghyth.app.kotlinstarter.core.main

import isfaaghyth.app.kotlinstarter.base.BasePresenter
import isfaaghyth.app.kotlinstarter.models.User
import retrofit2.Response
import rx.Subscriber

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
class MainPresenter(view: MainView): BasePresenter<MainView>() {

    init {
        super.attachView(view)
    }

    fun getUser(username: String) {
        subscribe(service!!.getUser(username), object : Subscriber<Response<User>>() {
            override fun onNext(res: Response<User>) {
                res.body()?.let {
                    view!!.onSuccess(it)
                }
            }
            override fun onError(e: Throwable?) {
                e!!.message?.let {
                    view!!.onError(it)
                }
            }
            override fun onCompleted() {

            }
        })
    }

}