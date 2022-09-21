package com.cpx.permissionc


import android.Manifest.permission.CALL_PHONE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testBtn:Button = findViewById(R.id.test)

        testBtn.setOnClickListener{
            PermissionC.request(this,android.Manifest.permission.CALL_PHONE){
                allGranted,deniedList ->
                if (allGranted){
                    call()
                }else{
                    Toast.makeText(this,"Yout denied $deniedList",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    fun call(){
        println("call")
    }
}