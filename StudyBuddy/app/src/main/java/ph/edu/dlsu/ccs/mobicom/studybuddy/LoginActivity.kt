package ph.edu.dlsu.ccs.mobicom.studybuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Login"

        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerRedirect = findViewById<Button>(R.id.registerRedirect)

        loginButton.setOnClickListener {
            // TODO: Add authentication logic here
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        registerRedirect.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
