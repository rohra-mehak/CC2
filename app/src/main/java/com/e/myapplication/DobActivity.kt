package com.e.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import com.e.myapplication.Constants.Companion.USER_DAY
import com.e.myapplication.Constants.Companion.USER_MONTH
import com.e.myapplication.Constants.Companion.USER_YEAR

class DobActivity : AppCompatActivity() {

    lateinit var nextButton: Button
    lateinit var datePicker: DatePicker

    protected  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dob_layout)

        datePicker = findViewById<DatePicker>(R.id.datePicker1)
        nextButton = findViewById<Button>(R.id.submit_dob_button)

        nextButton.setOnClickListener{

            // TODO validation on date + send date in intent
            val year = datePicker.year
            val month = datePicker.month
            val day = datePicker.dayOfMonth

            val intent = Intent(this, QuestionnaireActivity::class.java).apply {
                putExtra(USER_YEAR, year)
                putExtra(USER_MONTH, month)
                putExtra(USER_DAY, day)
            }
            finish()
            startActivity(intent)
        }
    }
}