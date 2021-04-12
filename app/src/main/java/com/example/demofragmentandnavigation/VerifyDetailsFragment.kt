package com.example.demofragmentandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demofragmentandnavigation.databinding.FragmentVerifyDetailsBinding


class VerifyDetailsFragment : Fragment() {

    private lateinit var binding: FragmentVerifyDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentVerifyDetailsBinding.inflate(inflater,container,false)

        val getName =arguments?.getString("nama")
        val getOccupation = arguments?.getString("pekerjaan")
        val getNoPhone =arguments?.getLong("no_hp")

        binding.tvName.text = getName
        binding.tvMobileNumber.text = getNoPhone.toString()
        binding.tvOccupation.text = getOccupation

        return binding.root
    }

}