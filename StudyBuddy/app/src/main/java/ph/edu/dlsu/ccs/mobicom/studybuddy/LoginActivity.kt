package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerRedirect = findViewById<TextView>(R.id.registerRedirect)

        loginButton.setOnClickListener {
            // Navigate to MainActivity (placeholder)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        registerRedirect.setOnClickListener {
            // Navigate to RegisterActivity (next step to create)
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}