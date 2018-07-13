package nyxdev.hackatren.taralrt1.appmodule.monitoring

import jdp.pocketlib.base.PocketAdapter
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import nyxdev.hackatren.taralrt1.global.model.obj.Station

class MonitoringAdapter : PocketAdapter() ,HasMonitoringContract.Adapter {
    var stationList : MutableList<Station> = ArrayList()
    override fun getItemCount(): Int = stationList.size

    override fun notifyLastInserted(): Job = launch(UI) {
        notifyItemInserted(itemCount)
    }
    override fun refreshAll():Job = launch(UI) {
        notifyDataSetChanged()
    }
}
