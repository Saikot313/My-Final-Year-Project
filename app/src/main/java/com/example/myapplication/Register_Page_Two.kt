package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class Register_Page_Two : AppCompatActivity() {

    private lateinit var edtx1 : EditText
    private lateinit var edtx2 : EditText
    private lateinit var chckbx : CheckBox
    private lateinit var chckbx2 : CheckBox
    lateinit var btn : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page_two)

        edtx1 = findViewById(R.id.EditText1)
        edtx2 = findViewById(R.id.EditText2)
        chckbx = findViewById(R.id.checkbox1)
        chckbx2 = findViewById(R.id.checkbox2)
        btn = findViewById(R.id.btn)




        chckbx.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Show password
                edtx1.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                // Hide password
                edtx1.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            // Move cursor to the end of the text
            edtx1.setSelection(edtx1.text?.length ?: 0)
        }
        chckbx2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Show password
                edtx2.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                // Hide password
                edtx2.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            // Move cursor to the end of the text
            edtx2.setSelection(edtx2.text?.length ?: 0)
        }


        btn.setOnClickListener {
            intent = Intent(this,Register_Page::class.java)
            startActivity(intent)
        }




    }
}