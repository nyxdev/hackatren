/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.crowdvolume

import android.os.Bundle
import io.reactivex.disposables.CompositeDisposable
import nyxdev.hackatren.taralrt1.appmodule.home.HomeView
import nyxdev.hackatren.taralrt1.global.base.DIBaseFragment
import javax.inject.Inject

class CrowdVolumeController : DIBaseFragment(), HasCrowdVolumeContract.Event {
    @field:[Inject] internal lateinit var presenter: HasCrowdVolumeContract.Presenter
    @field:[Inject] internal lateinit var viewMethod: HasCrowdVolumeContract.ViewMethod
    @field:[Inject] internal lateinit var subscription: CompositeDisposable

    override fun initialization(savedInstanceState: Bundle?) {
        HomeView.isOpenVolume=true
    }

    override fun onLoadEvent(savedInstanceState: Bundle?) {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        HomeView.isOpenVolume=false
        subscription.dispose()
    }
}