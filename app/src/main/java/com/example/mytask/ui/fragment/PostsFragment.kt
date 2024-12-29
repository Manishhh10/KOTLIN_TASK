package com.example.mytask.ui.fragment

import PostsAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PostsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PostsFragment : Fragment(R.layout.fragment_posts) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PostsAdapter
    private val images = listOf(
        R.drawable.a, // Replace with your drawable resource IDs
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.apple2,
        R.drawable.apple,
        R.drawable.e,
        R.drawable.f,
        R.drawable.p
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, 3) // 3 columns
        adapter = PostsAdapter(images)
        recyclerView.adapter = adapter
    }
}