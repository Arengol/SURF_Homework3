package ru.surf.vladimir.surfhomework3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FirstNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_name)
        findViewById<Button>(R.id.firstNameContinueBtn).setOnClickListener {
            val intent = Intent(this, LastNameActivity::class.java)
            intent.putExtra(USER_FIRST_NAME, findViewById<EditText>(R.id.firstNameET).text.toString())
            startActivity(intent)
        }
        findViewById<Button>(R.id.firstNameCancelBtn).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.firstNameBackBtn).setOnClickListener {
            finish()
        }
    }
}