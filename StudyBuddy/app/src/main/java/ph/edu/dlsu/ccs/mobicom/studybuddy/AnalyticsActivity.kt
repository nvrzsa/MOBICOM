package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AnalyticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analytics)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Go back to MainActivity
        }
    }
}
