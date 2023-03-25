package com.zmei.teoremapifagora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.teoremapifagora.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)


    }
    fun onClickResult(view: View){
        if (!isFieldEmpty()) {
            val result = getString(R.string.result_info)+ getResult()
            bind.tvResult.text = result
        }



    }
    private fun isFieldEmpty(): Boolean  {
    bind.apply {
       if (edA.text.isNullOrEmpty()) edA.error = "Не заполене поле"
        if (edB.text.isNullOrEmpty()) edB.error = "Не заполене поле"
        return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()
    }


    }
    private fun getResult(): String{
        val a: Double
        val b: Double
        bind.apply {
            a = edA.text.toString().toDouble()
            b = edB.text.toString().toDouble()
        }
        return sqrt(    (a.pow(2)+b.pow(2))     ).toString()

    }

}