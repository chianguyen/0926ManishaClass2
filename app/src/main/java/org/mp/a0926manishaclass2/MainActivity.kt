package org.mp.a0926manishaclass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn.setOnClickListener(View.OnClickListener {

            val fragmentOne = FragmentOne()

            val manager = supportFragmentManager.beginTransaction()
            manager.replace(R.id.main_act, fragmentOne)
            manager.commit()
            main_btn.visibility = View.GONE
        })
    }
}
