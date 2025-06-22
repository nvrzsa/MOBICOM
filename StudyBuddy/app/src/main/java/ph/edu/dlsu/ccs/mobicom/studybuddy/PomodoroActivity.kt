package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PomodoroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pomodoro)
        title = "Pomodoro"

        val startButton = findViewById<Button>(R.id.startButton)
        val pauseButton = findViewById<Button>(R.id.pauseButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val backButton = findViewById<Button>(R.id.backButton)

        startButton.setOnClickListener {
            // TODO: Add timer start logic
        }

        pauseButton.setOnClickListener {
            // TODO: Add timer pause logic
        }

        resetButton.setOnClickListener {
            // TODO: Add timer reset logic
        }

        backButton.setOnClickListener {
            finish() // back to main menu
        }
    }
}
