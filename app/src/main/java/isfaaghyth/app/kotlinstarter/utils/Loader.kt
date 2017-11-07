package isfaaghyth.app.kotlinstarter.utils

import android.app.ProgressDialog
import android.content.Context

/**
 * Created by isfaaghyth on 11/8/17.
 * github: @isfaaghyth
 */
object Loader {

    val context: Context?=null



    var progressDialog: ProgressDialog = ProgressDialog(context)

    init {
        progressDialog.setCancelable(false)
        progressDialog.setMessage("Tunggu ya")
    }

    fun show() {
        progressDialog.show()
    }

    fun hide() {
        progressDialog.hide()
    }

}