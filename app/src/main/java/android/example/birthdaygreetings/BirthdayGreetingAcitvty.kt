package android.example.birthdaygreetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreetingAcitvty : AppCompatActivity() {


    companion object{
        const val  NAME_EXTRA ="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting_acitvty)

        val name = intent.getStringExtra(NAME_EXTRA)
        val birthdayGreeting : TextView =findViewById(R.id.birthdayGreeting)
        birthdayGreeting.text ="Happy Birthday\n $name"
    }
}