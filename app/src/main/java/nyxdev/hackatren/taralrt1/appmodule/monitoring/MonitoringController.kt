/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.monitoring

import android.os.Bundle
import javax.inject.Inject
import io.reactivex.disposables.CompositeDisposable
import nyxdev.hackatren.taralrt1.global.base.DIBaseFragment

class MonitoringController : DIBaseFragment(), HasMonitoringContract.Event {
    @field:[Inject]
    internal lateinit var presenter: HasMonitoringContract.Presenter
    @field:[Inject]
    internal lateinit var viewMethod: HasMonitoringContract.ViewMethod
    @field:[Inject]
    internal lateinit var subscription: CompositeDisposable

    override fun initialization(savedInstanceState: Bundle?) {

    }

    override fun onLoadEvent(savedInstanceState: Bundle?) {

    }
}