package jp.techacademy.hiroshi.okazawa.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)

        if (editText1.length() != 0 && editText2.length() != 0) {

            var edittext1 = editText1.text.toString().toDouble()
            var edittext2 = editText2.text.toString().toDouble()

                if (v.id == R.id.button1) {
                    var sendText = edittext1 + edittext2
                    intent.putExtra("VALUE1", sendText)
                } else if (v.id == R.id.button2) {
                    var sendText = edittext1 - edittext2
                    intent.putExtra("VALUE1", sendText)
                } else if (v.id == R.id.button3) {
                    var sendText = edittext1 * edittext2
                    intent.putExtra("VALUE1", sendText)
                } else if (v.id == R.id.button4) {
                    var sendText = edittext1 / edittext2
                    intent.putExtra("VALUE1", sendText)
                }

            startActivity(intent)

        } else {

        }
    }
}
