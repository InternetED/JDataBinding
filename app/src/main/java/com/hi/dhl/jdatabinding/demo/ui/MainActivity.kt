package com.hi.dhl.jdatabinding.demo.ui

import android.os.Bundle
import android.widget.Toast
import com.hi.dhl.jdatabinding.DataBindingActivity
import com.hi.dhl.jdatabinding.demo.AppDialog
import com.hi.dhl.jdatabinding.demo.R
import com.hi.dhl.jdatabinding.demo.databinding.ActivityMainBinding

class MainActivity : DataBindingActivity() {
    private val mBinding: ActivityMainBinding by binding(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.apply {
            dialog.setOnClickListener {
                val msg = getString(R.string.dialog_msg)
                AppDialog(
                    context = this@MainActivity,
                    message = msg,
                    yes = {
                        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
                    }).show()
            }

            supportFragmentManager.beginTransaction()
                .add(
                    R.id.container,
                    FragmentTest(), FragmentTest::class.simpleName
                )
                .commitAllowingStateLoss()
        }

    }
}
