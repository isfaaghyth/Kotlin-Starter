package isfaaghyth.app.kotlinstarter.core.main

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import isfaaghyth.app.kotlinstarter.R
import isfaaghyth.app.kotlinstarter.base.BaseActivity
import isfaaghyth.app.kotlinstarter.models.User
import isfaaghyth.app.kotlinstarter.network.NetworkClient
import isfaaghyth.app.kotlinstarter.network.Routes

/**
 * Created by isfaaghyth on 11/7/17.
 * github: @isfaaghyth
 */
class MainActivity: BaseActivity<MainPresenter>(), MainView {

    @BindView(R.id.edt_username) lateinit var edtUsername: EditText
    @BindView(R.id.img_avatar) lateinit var imgAvatar: ImageView
    @BindView(R.id.txt_name) lateinit var txtName: TextView
    @BindView(R.id.txt_bio) lateinit var txtBio: TextView

    override val initPresenter: MainPresenter
        get() = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding(R.layout.activity_main)
    }

    @OnClick(R.id.btn_cari)
    internal fun onFindClicked() {
        val username: String? = edtUsername.text.toString()
        message("username $username")
        presenter?.getUser()
    }

    override fun onError(err: String) {
        Log.e("TAG", err)
    }

    override fun onSuccess(user: User) {
        message("ini apa? ${user.name}")
    }

}