package info.tmpz84.app.kassisandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val MY_REQUEST_CODE = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workButton: Button = findViewById(R.id.workButton)
        workButton.setOnClickListener {

            val intent: Intent = Intent(this, WorkActivity::class.java)
            intent.putExtra("number", 120)
            intent.putExtra("string", "The message from MainActivity")

            startActivityForResult(intent, MY_REQUEST_CODE)
        }

    }
}
