package com.hi.dhl.jdatabinding.demo.ui

import android.view.View
import com.hi.dhl.jdatabinding.DataBindingViewHolder
import com.hi.dhl.jdatabinding.demo.databinding.RecycieItemTestBinding

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/4/19
 *     desc  :
 * </pre>
 */
class TestViewHolder(view: View) : DataBindingViewHolder<Model>(view) {

    val binding: RecycieItemTestBinding by viewHolderBinding(view)

    override fun bindData(data: Model) {
        binding.apply {
            model = data
            executePendingBindings()
        }
    }
}