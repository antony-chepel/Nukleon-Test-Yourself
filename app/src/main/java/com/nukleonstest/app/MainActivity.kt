package com.nukleonstest.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nukleonstest.app.databinding.MainScreenTestBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : MainScreenTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainScreenTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        awqeqwqwe()
    }



    private fun awqeqwqwe() = with(binding){
        checkBox.setOnClickListener {
            if(checkBox.isChecked){
                checkBox2.isChecked = false
                checkBox3.isChecked = false
            }

            if(checkBox2.isChecked){
                checkBox.isChecked = false
                checkBox3.isChecked = false
            }
            if(checkBox3.isChecked){
                checkBox.isChecked = false
                checkBox2.isChecked = false
            }

            checkBox2.setOnClickListener {
                if (checkBox2.isChecked) {
                    checkBox.isChecked = false
                    checkBox3.isChecked = false
                }

                if (checkBox.isChecked) {
                    checkBox2.isChecked = false
                    checkBox3.isChecked = false
                }
                if (checkBox3.isChecked) {
                    checkBox2.isChecked = false
                    checkBox.isChecked = false
                }
            }

            checkBox3.setOnClickListener {
                if (checkBox3.isChecked) {
                    checkBox2.isChecked = false
                    checkBox.isChecked = false
                }

                if (checkBox.isChecked) {
                    checkBox2.isChecked = false
                    checkBox3.isChecked = false
                }
                if (checkBox3.isChecked) {
                    checkBox2.isChecked = false
                    checkBox.isChecked = false
                }
            }

            checkBox4.setOnClickListener {
                if(checkBox4.isChecked){
                    checkBox5.isChecked = false
                    checkBox6.isChecked = false
                }

                if(checkBox5.isChecked){
                    checkBox4.isChecked = false
                    checkBox6.isChecked = false
                }
                if(checkBox6.isChecked){
                    checkBox4.isChecked = false
                    checkBox5.isChecked = false
                }
            }

            checkBox5.setOnClickListener {
                if(checkBox5.isChecked){
                    checkBox4.isChecked = false
                    checkBox6.isChecked = false
                }

                if(checkBox4.isChecked){
                    checkBox5.isChecked = false
                    checkBox6.isChecked = false
                }
                if(checkBox6.isChecked){
                    checkBox4.isChecked = false
                    checkBox5.isChecked = false
                }
            }

            checkBox6.setOnClickListener {
                if(checkBox6.isChecked){
                    checkBox5.isChecked = false
                    checkBox4.isChecked = false
                }

                if(checkBox5.isChecked){
                    checkBox4.isChecked = false
                    checkBox6.isChecked = false
                }
                if(checkBox4.isChecked){
                    checkBox5.isChecked = false
                    checkBox6.isChecked = false
                }
            }

            checkBox7.setOnClickListener {
                if(checkBox7.isChecked){
                    checkBox8.isChecked = false
                    checkBox9.isChecked = false
                }

                if(checkBox8.isChecked){
                    checkBox7.isChecked = false
                    checkBox9.isChecked = false
                }
                if(checkBox9.isChecked){
                    checkBox8.isChecked = false
                    checkBox7.isChecked = false
                }
            }

            checkBox8.setOnClickListener {
                if(checkBox8.isChecked){
                    checkBox7.isChecked = false
                    checkBox9.isChecked = false
                }

                if(checkBox9.isChecked){
                    checkBox8.isChecked = false
                    checkBox7.isChecked = false
                }
                if(checkBox7.isChecked){
                    checkBox8.isChecked = false
                    checkBox9.isChecked = false
                }
            }

            checkBox9.setOnClickListener {
                if(checkBox9.isChecked){
                    checkBox8.isChecked = false
                    checkBox7.isChecked = false
                }

                if(checkBox8.isChecked){
                    checkBox7.isChecked = false
                    checkBox9.isChecked = false
                }
                if(checkBox7.isChecked){
                    checkBox8.isChecked = false
                    checkBox9.isChecked = false
                }
            }

            checkBox10.setOnClickListener {
                if(checkBox10.isChecked){
                    checkBox11.isChecked = false
                    checkBox12.isChecked = false
                }

                if(checkBox11.isChecked){
                    checkBox10.isChecked = false
                    checkBox12.isChecked = false
                }
                if(checkBox12.isChecked){
                    checkBox11.isChecked = false
                    checkBox10.isChecked = false
                }
            }

            checkBox11.setOnClickListener {
                if(checkBox11.isChecked){
                    checkBox10.isChecked = false
                    checkBox12.isChecked = false
                }

                if(checkBox12.isChecked){
                    checkBox11.isChecked = false
                    checkBox10.isChecked = false
                }
                if(checkBox11.isChecked){
                    checkBox12.isChecked = false
                    checkBox10.isChecked = false
                }
            }

            checkBox12.setOnClickListener {
                if(checkBox12.isChecked){
                    checkBox10.isChecked = false
                    checkBox11.isChecked = false
                }

                if(checkBox11.isChecked){
                    checkBox12.isChecked = false
                    checkBox10.isChecked = false
                }
                if(checkBox12.isChecked){
                    checkBox11.isChecked = false
                    checkBox10.isChecked = false
                }
            }



        }
        resB.setOnClickListener {

            if(checkBox.isChecked || checkBox2.isChecked|| checkBox3.isChecked&&
                checkBox4.isChecked|| checkBox5.isChecked|| checkBox6.isChecked&&
                checkBox7.isChecked|| checkBox8.isChecked|| checkBox9.isChecked&& checkBox10.isChecked||
                checkBox11.isChecked|| checkBox12.isChecked) {
                startActivity(Intent(this@MainActivity, ResultActivity::class.java))
            } else {
                tvError.visibility = View.VISIBLE
            }

        }
    }
}