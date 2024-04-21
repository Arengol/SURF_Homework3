package ru.surf.vladimir.surfhomework3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.age)
        findViewById<Button>(R.id.ageCancelBtn).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.ageContinueBtn).setOnClickListener {
            val userFirstName = intent.extras?.getString(USER_FIRST_NAME)
            val userLastName = intent.extras?.getString(USER_LAST_NAME)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(USER_FIRST_NAME, userFirstName)
            intent.putExtra(USER_LAST_NAME, userLastName)
            intent.putExtra(USER_AGE, findViewById<EditText>(R.id.ageET).text.toString())
            startActivity(intent)
        }
        findViewById<Button>(R.id.ageBackBtn).setOnClickListener {
            finish()
        }
    }
}