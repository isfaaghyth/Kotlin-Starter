package isfaaghyth.app.kotlinstarter.core.main

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick
import isfaaghyth.app.kotlinstarter.R
import isfaaghyth.app.kotlinstarter.base.BaseActivity
import isfaaghyth.app.kotlinstarter.models.Post

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
        presenter!!.getPosts()
    }

    @OnClick(R.id.btn_cari)
    internal fun onFindClicked() {
        val username: String? = edtUsername.text.toString()
        Log.d("TAG", username)
    }

    override fun onError(err: String) {
        Log.e("TAG", err)
    }

    override fun onSuccess(post: Post) {
        Log.d("TAG", post.status)
    }

}