package com.love2knot.costumdrawer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.love2knot.costumdrawer.databinding.FragmentHomeBinding
import com.love2knot.costumdrawer.ui.adapter.HorizontalItemAdapter
import com.love2knot.costumdrawer.ui.adapter.VerticalItemAdapter

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.rvItemHorizontal.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvItemHorizontal.adapter = HorizontalItemAdapter(requireActivity())
        binding.rvItemVertical.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvItemVertical.adapter = VerticalItemAdapter(requireActivity())

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}