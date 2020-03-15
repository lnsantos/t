package com.nepoapp.todo.source.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nepoapp.todo.R
import com.nepoapp.todo.source.ui.home.MainViewHome
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainViewSplash : AppCompatActivity() {

    private val mViewModel : ViewModelSplash by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel.startLastAccess()
        Toast.makeText(this,
            mViewModel.getLastAccess(),
            Toast.LENGTH_LONG).show()
        start()
    }
    private fun start(){
        val intent = Intent(this,MainViewHome::class.java)
        startActivity(intent)
    }
}
