package isfaaghyth.app.kotlinstarter.core.main

import isfaaghyth.app.kotlinstarter.models.Post

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
interface MainView {
    fun onSuccess(post: Post)
    fun onError(err: String)
}