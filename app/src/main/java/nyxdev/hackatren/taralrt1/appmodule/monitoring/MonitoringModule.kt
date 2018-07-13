/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.monitoring

import android.annotation.SuppressLint
import dagger.Binds
import dagger.Module
import dagger.Provides
import nyxdev.hackatren.taralrt1.global.scope.FragmentScope
import io.reactivex.disposables.CompositeDisposable
import nyxdev.hackatren.taralrt1.R
import android.support.v4.app.Fragment

@Module
object MonitoringModule {
    @FragmentScope
    @Provides
    @JvmStatic
    fun provideSubscription() = CompositeDisposable()

    @FragmentScope
    @Provides
    @JvmStatic
    fun provideComponent(controller: MonitoringController): MonitoringView {
        controller.rootView = controller.layoutInflater.inflate(R.layout.fragment_monitoring, controller.container, false)
        return MonitoringView(controller.rootView!!, controller as HasMonitoringContract.Event)
    }

    @FragmentScope
    @Provides
    @JvmStatic
    fun provideViewMethod(controller: MonitoringController, view: MonitoringView): HasMonitoringContract.ViewMethod = MonitoringViewImpl(fragment = controller as Fragment, view = view)

    @FragmentScope
    @Provides
    @JvmStatic
    fun providePresenter(viewMethod: HasMonitoringContract.ViewMethod): HasMonitoringContract.Presenter = MonitoringImpl(viewMethod)

}