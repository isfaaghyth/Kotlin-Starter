package isfaaghyth.app.kotlinstarter.core.main

import android.os.Bundle
import isfaaghyth.app.kotlinstarter.R
import isfaaghyth.app.kotlinstarter.base.BaseActivity
import isfaaghyth.app.kotlinstarter.models.User

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
class MainActivity: BaseActivity<MainPresenter>(), MainView {

    override val initPresenter: MainPresenter
        get() = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding(R.layout.activity_main)

    }

    override fun onError(err: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSuccess(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}