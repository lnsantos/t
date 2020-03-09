package com.nepoapp.todo.source.view.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nepoapp.todo.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainViewSplash : AppCompatActivity() {

    private val mViewModel : ViewModelSplash by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"${mViewModel.teste}",Toast.LENGTH_LONG).show()
    }

}
