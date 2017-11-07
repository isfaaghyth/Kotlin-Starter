package isfaaghyth.app.kotlinstarter.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import isfaaghyth.app.kotlinstarter.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
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
                    .baseUrl(BuildConfig.MAIN_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
        }
    }

}