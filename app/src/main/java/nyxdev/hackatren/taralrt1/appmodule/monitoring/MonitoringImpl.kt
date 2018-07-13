/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.monitoring

import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import nyxdev.hackatren.taralrt1.global.model.obj.Station

class MonitoringImpl(
        private val viewMethod: HasMonitoringContract.ViewMethod,
        private val adapter: MonitoringAdapter
) : HasMonitoringContract.Presenter {
    val sampleList= ArrayList<Station>().apply {
        for (x in 0 until 20){
            val sample=Station()
            this.add(sample)
        }
    }
    override fun loadStations(): Disposable
        = Observable.fromIterable(sampleList)
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.newThread())
            .doOnNext {
                adapter.stationList.add(it)
                adapter.notifyLastInserted()
            }
            .subscribe()
}