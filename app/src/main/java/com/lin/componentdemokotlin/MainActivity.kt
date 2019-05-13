package com.lin.componentdemokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPanel.setOnClickListener {
            ARouter.getInstance()
                .build("/comp2/MainActivity")
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .navigation()
        }
    }
}
