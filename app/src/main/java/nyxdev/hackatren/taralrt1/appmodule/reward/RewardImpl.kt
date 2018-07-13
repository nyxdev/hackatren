/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.reward

import nyxdev.hackatren.taralrt1.global.model.obj.reward.Reward
import nyxdev.hackatren.taralrt1.global.util.RewardListType

class RewardImpl(
        private val viewMethod: HasRewardContract.ViewMethod,
        private val adapter: RewardAdapter
) : HasRewardContract.Presenter {
    override fun loadDefaultItemList() {
        val option = Reward()
        option.type= RewardListType.OPTION
        adapter.rewardList.add(option)
        adapter.notifyLastInserted()
        val title = Reward()
        title.type= RewardListType.TITLE
        adapter.rewardList.add(title)
        adapter.notifyLastInserted()

        for (x in 0 until  20){
            val history = Reward()
            history.type= RewardListType.HISTORY
            adapter.rewardList.add(history)
            adapter.notifyLastInserted()

        }
    }
}