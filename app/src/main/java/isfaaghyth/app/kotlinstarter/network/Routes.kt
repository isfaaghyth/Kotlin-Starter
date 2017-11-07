package isfaaghyth.app.kotlinstarter.network

import io.reactivex.Observable
import isfaaghyth.app.kotlinstarter.models.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
interface Routes {

    /*
    * @param: github_username
    * Mendapatkan profil github berdasarkan username
    * */
    @GET("/users/{username}")
    fun getUser(@Path("username") username: String): Observable<Response<User>>

}