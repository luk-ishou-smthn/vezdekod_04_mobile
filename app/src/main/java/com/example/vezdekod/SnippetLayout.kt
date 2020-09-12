package com.example.vezdekod

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.snippet_layout.*
import kotlinx.android.synthetic.main.snippet_layout.button_send

class SnippetLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.snippet_layout)

        button_send.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.youtube.com/watch?v=IoN6ywr3K8U"))
            intent.setPackage("com.google.android.youtube")
            startActivity(intent)


        }
    }


}