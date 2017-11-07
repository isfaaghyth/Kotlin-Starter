package isfaaghyth.app.kotlinstarter.utils

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by isfaaghyth on 11/8/17.
 * github: @isfaaghyth
 */
class MainScheduler<T>: SchedulerTransformer<T>(Schedulers.io(), AndroidSchedulers.mainThread())