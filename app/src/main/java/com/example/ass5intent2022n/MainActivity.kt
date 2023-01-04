package com.example.ass5intent2022n

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.ass5intent2022n.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun showResult(view : View){

        var  radioGroup: RadioGroup =  findViewById(R.id.radioGroup)
        var  selectedId : Int = radioGroup.checkedRadioButtonId
        var  radioButton : RadioButton = findViewById(selectedId)


        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("empData", Employee(binding.edtName.text.toString(),radioButton.text.toString(),
            binding.edtEMail.text.toString(), binding.edtSalary.text.toString().toInt()))
        startActivity(intent)

    }


    fun resetData(v: View){
        binding.edtName.text.clear()
        //edit_password.text.clear()
        binding.edtEMail.text.clear()
        binding.edtSalary.text.clear()
        var  radioGroup: RadioGroup =  findViewById(R.id.radioGroup)
        radioGroup.clearCheck()

    }
}