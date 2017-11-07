package isfaaghyth.app.kotlinstarter.network

import isfaaghyth.app.kotlinstarter.models.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
interface Routes {

    /*
    * @param: github_username
    * Mendapatkan profil github berdasarkan username
    * */
    @GET("/users/{github_username}")
    fun getUser(@Path("github_username") username: String): Observable<Response<User>>

}