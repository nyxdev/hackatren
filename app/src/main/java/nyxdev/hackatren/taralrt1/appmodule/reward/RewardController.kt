/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.reward

import android.os.Bundle
import io.reactivex.disposables.CompositeDisposable
import nyxdev.hackatren.taralrt1.R
import nyxdev.hackatren.taralrt1.appmodule.home.HomeView
import nyxdev.hackatren.taralrt1.global.base.DIBaseFragment
import javax.inject.Inject

class RewardController : DIBaseFragment(), HasRewardContract.Event {
    @field:[Inject] internal lateinit var presenter: HasRewardContract.Presenter
    @field:[Inject] internal lateinit var viewMethod: HasRewardContract.ViewMethod
    @field:[Inject] internal lateinit var subscription: CompositeDisposable

    override fun initialization(savedInstanceState: Bundle?) {
        HomeView.isOpenReward=true
    }

    override fun onLoadEvent(savedInstanceState: Bundle?) {
        presenter.loadDefaultItemList()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        HomeView.isOpenReward=false
        subscription.dispose()
    }

    override fun onEarnPointsEvent() {
        viewMethod.gotoARFragment(activity!!.findViewById(R.id.appBarLayout))
    }

    override fun onRedeemEvent() {
        viewMethod.showClaimRewardDialog()
    }
}