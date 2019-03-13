package com.levelup.dagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.RequestManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    private companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }
}
