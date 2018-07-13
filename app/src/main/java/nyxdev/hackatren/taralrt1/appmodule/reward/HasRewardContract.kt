/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.reward

import kotlinx.coroutines.experimental.Job

interface HasRewardContract {
    interface Event

    interface ViewMethod

    interface Presenter {
        fun loadDefaultItemList()
    }

    interface Adapter {

        fun notifyLastInserted(): Job
        fun refreshAll(): Job
    }

}