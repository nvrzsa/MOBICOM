package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        title = "Register"

        val backToLogin = findViewById<Button>(R.id.backToLogin)
        backToLogin.setOnClickListener {
            finish() // Returns to LoginActivity
        }

        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            // TODO: Implement Firebase registration later
        }
    }
}
