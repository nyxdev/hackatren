package nyxdev.hackatren.taralrt1.appmodule.claimreward

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import com.rey.material.app.Dialog
import io.reactivex.disposables.CompositeDisposable
import nyxdev.hackatren.taralrt1.R

class ClaimRewardDialog(context: Context) : Dialog(context),HasClaimRewardContract.Event {
    private val subscription= CompositeDisposable()

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = layoutInflater.inflate(R.layout.dialog_claim_reward, null)
        setContentView(layout)
        val adapter = ClaimRewardAdapter()
        val viewholder = ClaimRewardViewholder(adapter = adapter,context = context!!)
        viewholder.setContentView(R.layout.item_list_rewards)
        adapter.addViewHolder(viewholder)
        val  view = ClaimRewardView(view= layout,adapter=adapter,context=context!!)
        val presenter:HasClaimRewardContract.Presenter = ClaimRewardImpl(adapter)
        subscription.addAll(presenter.loadLoadRewards())
    }

    override fun onStop() {
        super.onStop()
        subscription.dispose()
    }

}