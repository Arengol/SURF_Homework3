package ru.surf.vladimir.surfhomework3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LastNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.last_name)
        findViewById<Button>(R.id.lastNameContinueBtn).setOnClickListener {
            val userFirstName = intent.extras?.getString(USER_FIRST_NAME)
            val intent = Intent(this, AgeActivity::class.java)
            intent.putExtra(USER_FIRST_NAME, userFirstName)
            intent.putExtra(USER_LAST_NAME, findViewById<EditText>(R.id.lastNameET).text.toString())
            intent.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT)
            startActivity(intent)
        }
        findViewById<Button>(R.id.lastNameCancelBtn).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.lastNameBackBtn).setOnClickListener {
            finish()
        }
    }
}