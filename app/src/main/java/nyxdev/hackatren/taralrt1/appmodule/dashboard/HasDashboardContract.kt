/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.dashboard

import io.reactivex.disposables.Disposable
import kotlinx.coroutines.experimental.Job

interface HasDashboardContract {
    interface Event

    interface ViewMethod

    interface Presenter {
        fun loadAnnouncement(): Disposable
    }

    interface Adapter {
        fun refreshAll(): Job
        fun notifyLastInserted():Job
    }

}