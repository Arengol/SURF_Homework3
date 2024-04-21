package ru.surf.vladimir.surfhomework3

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.startRegistrationButton).setOnClickListener {
            val intent = Intent(this, FirstNameActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        val firstName = intent?.getStringExtra(USER_FIRST_NAME)
        val lastName = intent?.getStringExtra(USER_LAST_NAME)
        //val age = intent?.getStringExtra(USER_AGE) // По заданию не сказано что это надо показывать
        if (!firstName.isNullOrEmpty() or !firstName.isNullOrEmpty())
            findViewById<TextView>(R.id.userInfoTV).setText("Добро пожаловать, $firstName $lastName")
    }
}