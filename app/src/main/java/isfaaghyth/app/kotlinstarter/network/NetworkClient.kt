package isfaaghyth.app.kotlinstarter.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
class NetworkClient {

    companion object {
        val instance: Retrofit by lazy {
            val gson: Gson = GsonBuilder().setLenient().create()
            Retrofit.Builder()
                    .baseUrl("http://google.com")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build()
        }
    }

}