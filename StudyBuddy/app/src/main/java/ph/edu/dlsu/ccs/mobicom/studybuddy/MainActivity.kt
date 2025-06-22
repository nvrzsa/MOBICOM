package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startTimerButton = findViewById<Button>(R.id.startTimerButton)
        val viewAnalyticsButton = findViewById<Button>(R.id.viewAnalyticsButton)
        val viewRewardsButton = findViewById<Button>(R.id.viewRewardsButton)
        val viewProgressButton = findViewById<Button>(R.id.viewProgressButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        viewProgressButton.setOnClickListener {
            val intent = Intent(this, ProgressDashboardActivity::class.java)
            startActivity(intent)
        }

        startTimerButton.setOnClickListener {
            val intent = Intent(this, PomodoroActivity::class.java)
            startActivity(intent)
        }

        viewAnalyticsButton.setOnClickListener {
            val intent = Intent(this, AnalyticsActivity::class.java)
            startActivity(intent)
        }

        viewRewardsButton.setOnClickListener {
            val intent = Intent(this, RewardsActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }


    }
}
