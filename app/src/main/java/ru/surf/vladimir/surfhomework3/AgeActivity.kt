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
            val result = Intent(this, MainActivity::class.java)
            result.putExtra(USER_FIRST_NAME, userFirstName)
            result.putExtra(USER_LAST_NAME, userLastName)
            result.putExtra(USER_AGE, findViewById<EditText>(R.id.ageET).text.toString())
            startActivity(result)
        }
        findViewById<Button>(R.id.ageBackBtn).setOnClickListener {
            finish()
        }
    }
}