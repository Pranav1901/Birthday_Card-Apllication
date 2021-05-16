package android.example.birthdaygreetings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Create_Card(view: View) {
        val nameInput : EditText =findViewById(R.id.nameInput)
        val name = nameInput.text.toString()
//        Toast.makeText(this,"Hello $name",Toast.LENGTH_LONG).show()
        val intent = Intent(this,BirthdayGreetingAcitvty::class.java)     //call the activity of intent
        intent.putExtra(BirthdayGreetingAcitvty.NAME_EXTRA,name)    //what to send with intent
        startActivity(intent)                                       //

    }
}