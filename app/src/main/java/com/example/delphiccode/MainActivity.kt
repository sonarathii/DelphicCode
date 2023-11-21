package com.example.delphiccode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.delphiccode.databinding.ActivityMainBinding
import com.pg.crm.Adapetr

class MainActivity : AppCompatActivity() {

    val arrlist= arrayListOf<String>()
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main2)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val et_value= binding.etText
        val btn=binding.btnInsert
        val list=binding.listItem



        btn.setOnClickListener {
            arrlist.add(et_value.text.toString())
            val adapter=Adapetr(this,arrlist)
            list.adapter=adapter }

    }
}