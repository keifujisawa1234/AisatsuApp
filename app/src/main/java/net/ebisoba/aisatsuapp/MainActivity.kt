package net.ebisoba.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
 //       TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if(v.id == R.id.button1){
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_k", "$hour:$minute")
                    if(hour>1 && hour<10){
                        if(minute>=0 && minute<60){
                            textView.text = "おはよう"
                        }
                    }
                    else if (hour>=10 && hour<=18){
                        if(minute>=0 && minute<60){
                            textView.text = "こんにちは"
                        }
                    }
                    else{
                        textView.text = "こんばんは"
                    }
//                    textView.text = "$hour:$minute"
                },
                13, 0, true)
        timePickerDialog.show()
    }

}
