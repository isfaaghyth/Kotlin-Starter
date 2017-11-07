package isfaaghyth.app.kotlinstarter.core.main

import isfaaghyth.app.kotlinstarter.models.User

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
interface MainView {
    fun onSuccess(user: User)
    fun onError(err: String)
}