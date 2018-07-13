/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.monitoring

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.animation.OvershootInterpolator
import android.widget.LinearLayout
import jdp.pocketlib.layoutmanager.PocketLinearLayout
import jp.wasabeef.recyclerview.adapters.SlideInLeftAnimationAdapter
import nyxdev.hackatren.taralrt1.R

class MonitoringView(
        view: View,
        event: HasMonitoringContract.Event,
        adapter: MonitoringAdapter) {
    val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)!!.apply {
        val animAdapter = SlideInLeftAnimationAdapter(adapter)
        animAdapter.setInterpolator(OvershootInterpolator())
        animAdapter.setFirstOnly(false)
        animAdapter.setDuration(800)
        this.adapter = animAdapter
        this.layoutManager = PocketLinearLayout(context = context,horizontal = LinearLayout.VERTICAL,b = false)
    }
}