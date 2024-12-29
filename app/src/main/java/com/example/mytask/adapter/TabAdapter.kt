package com.example.myapplication_app.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mytask.ui.fragment.PostsFragment
import com.example.mytask.ui.fragment.ReelsFragment
import com.example.mytask.ui.fragment.TaggedFragment

class TabAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0-> return PostsFragment()
            1-> return ReelsFragment()
            2-> return TaggedFragment()
            else-> return ReelsFragment()
        }
    }

}