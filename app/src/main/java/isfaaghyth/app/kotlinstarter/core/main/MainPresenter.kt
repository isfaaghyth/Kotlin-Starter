package isfaaghyth.app.kotlinstarter.core.main

import isfaaghyth.app.kotlinstarter.base.BasePresenter
import isfaaghyth.app.kotlinstarter.models.User
import isfaaghyth.app.kotlinstarter.network.RequestCallback
import retrofit2.Response

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
class MainPresenter(view: MainView): BasePresenter<MainView>() {

    init {
        super.attachView(view)
    }

    fun getUser() {
        service?.getUser()?.let {
            subscribe(it)
        }
    }

}