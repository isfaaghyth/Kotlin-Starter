package isfaaghyth.app.kotlinstarter

import android.app.Application
import android.support.multidex.MultiDex

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }

}