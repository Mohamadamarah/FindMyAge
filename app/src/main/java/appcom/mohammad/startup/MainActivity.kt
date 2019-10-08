package appcom.mohammad.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buGetAge.setOnClickListener(){
            //Button Is Clicked
            try {

                val yearOfBirth: Int = etUserYearOfBirth.text.toString().toInt()
                val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                val age = currentYear - yearOfBirth
                tvShowAge.text = "Your Age Is : $age Years"

            }catch(ex :Exception){
                tvShowAge.text = "Enter Your Year Of Birth Please"
            }

        }
    }
}
