package org.mp.a0926manishaclass2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_one, container, false)

        view.frag1_btn.setOnClickListener(View.OnClickListener {

            var fragTwo = FragmentTwo()
            var bund = Bundle()

            bund.putString("key", "This is data from Fragment One")
            fragTwo.arguments = bund

            fragmentManager!!.beginTransaction().replace(R.id.main_act, fragTwo).addToBackStack(null).commit()

        })

        return view
    }

}