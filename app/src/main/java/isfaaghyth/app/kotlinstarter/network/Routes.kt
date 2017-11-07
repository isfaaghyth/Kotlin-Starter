package isfaaghyth.app.kotlinstarter.network

import io.reactivex.Observable
import isfaaghyth.app.kotlinstarter.models.Post
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
interface Routes {

    /*
    * @param: github_username
    * Mendapatkan profil github berdasarkan username
    * */
    @GET("/?json=1")
    fun getPosts(): Observable<Response<Post>>

}