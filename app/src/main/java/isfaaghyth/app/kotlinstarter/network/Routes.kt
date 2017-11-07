package isfaaghyth.app.kotlinstarter.network

import io.reactivex.Observable
import isfaaghyth.app.kotlinstarter.models.User
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
    @GET("/users/isfaaghyth")
    fun getUser(): Observable<Response<User>>

}