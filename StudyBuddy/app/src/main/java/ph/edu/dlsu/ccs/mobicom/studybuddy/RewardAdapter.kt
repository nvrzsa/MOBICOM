package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RewardAdapter(private val rewards: List<Reward>) :
    RecyclerView.Adapter<RewardAdapter.RewardViewHolder>() {

    class RewardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rewardTitle: TextView = itemView.findViewById(R.id.rewardTitle)
        val rewardImage: ImageView = itemView.findViewById(R.id.rewardImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RewardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_reward, parent, false)
        return RewardViewHolder(view)
    }

    override fun onBindViewHolder(holder: RewardViewHolder, position: Int) {
        val reward = rewards[position]
        holder.rewardTitle.text = reward.title
        holder.rewardImage.setImageResource(reward.iconResId)
    }

    override fun getItemCount(): Int = rewards.size
}
