package isfaaghyth.app.kotlinstarter.base

import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import butterknife.ButterKnife

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
abstract class BaseActivity<P: BasePresenter<*>>: AppCompatActivity() {

    protected open var presenter: P?=null
    protected abstract val initPresenter: P

    protected fun binding(layoutID: Int) {
        setContentView(layoutID)
        ButterKnife.bind(this)
        presenter = initPresenter
    }

    override fun onDestroy() {
        super.onDestroy()
        if (presenter != null)
            presenter!!.dettachView()
    }

    protected fun message(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

}