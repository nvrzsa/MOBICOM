package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RewardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)
        title = "Rewards"

        val rewards = listOf(
            Reward("7-Day Streak", R.drawable.ic_baseline_star_24),
            Reward("Focus Master", R.drawable.ic_baseline_star_24),
            Reward("30 Pomodoros", R.drawable.ic_baseline_star_24)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rewardsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RewardAdapter(rewards)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}
