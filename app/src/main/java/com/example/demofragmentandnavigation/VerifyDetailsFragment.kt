package com.example.demofragmentandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.demofragmentandnavigation.databinding.FragmentVerifyDetailsBinding


class VerifyDetailsFragment : Fragment() {

    private lateinit var binding: FragmentVerifyDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentVerifyDetailsBinding.inflate(inflater,container,false)

        val args : VerifyDetailsFragmentArgs by navArgs()
        val name = args.nama
        val pekerjaan = args.pekerjaan
        val noPhone = args.noHp

        /*val getName =arguments?.getString("nama")
        val getOccupation = arguments?.getString("pekerjaan")
        val getNoPhone =arguments?.getLong("no_hp")*/

        binding.tvName.text = name
        binding.tvMobileNumber.text = noPhone.toString()
        binding.tvOccupation.text = pekerjaan

        return binding.root
    }

}