package com.example.ass5intent2022n

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ass5intent2022n.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bindingSecond : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingSecond = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingSecond.root)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")

        bindingSecond.txtName.text = "Employee Name : ${newEmployee?.name}"
        bindingSecond.txtGender.text  = "Gender : ${newEmployee?.gender}"
        bindingSecond.txtEmail.text  = "E-mail : ${newEmployee?.email}"
        bindingSecond.txtSalary.text  = "Salary : ${String.format("%,d",newEmployee?.salary)} Baht"
        //String.format("%,d",items[position].salary)

        bindingSecond.btnClose.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}