package isfaaghyth.app.kotlinstarter.core.main

import isfaaghyth.app.kotlinstarter.base.BasePresenter
import isfaaghyth.app.kotlinstarter.models.User
import isfaaghyth.app.kotlinstarter.utils.ScheduleUtils
import retrofit2.Response

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
class MainPresenter(view: MainView): BasePresenter<MainView>() {

    init {
        super.attachView(view)
    }

    fun getUser(username: String) {
        subscribe(service?.getUser(username)!!
                .compose(ScheduleUtils.set<Response<User>>())
                .subscribe(
                        {res -> res.body()?.let { view?.onSuccess(it) } },
                        {err -> view?.onError(err.message!!)},
                        {}
                ))
    }

}