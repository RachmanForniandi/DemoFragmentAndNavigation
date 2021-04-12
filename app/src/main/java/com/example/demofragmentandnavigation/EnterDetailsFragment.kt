package com.example.demofragmentandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.demofragmentandnavigation.databinding.FragmentEnterDetailsBinding

class EnterDetailsFragment : Fragment() {

    private lateinit var binding: FragmentEnterDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val rootView =inflater.inflate(R.layout.fragment_enter_details, container, false)
        binding = FragmentEnterDetailsBinding.inflate(layoutInflater,container,false)

        binding.btnVerifyDetails.setOnClickListener {
            val inputName = binding.etName.text.toString()
            val inputJob = binding.etJob.text.toString()
            val inputNoPhone = binding.etMobile.text.toString()

            when{
                inputName.isEmpty()->{
                    Toast.makeText(activity, "Mohon isi nama", Toast.LENGTH_SHORT).show()
                }

                inputJob.isEmpty()->{
                    Toast.makeText(activity, "Mohon isi jenis pekerjaan", Toast.LENGTH_SHORT).show()
                }
                inputNoPhone.isEmpty()->{
                    Toast.makeText(activity, "Mohon isi no Handphone", Toast.LENGTH_SHORT).show()
                }
                else->{
                   /* val bundle = bundleOf(
                            "nama" to inputName,
                            "pekerjaan" to inputJob,
                            "no_hp" to inputNoPhone.toLong()
                    )
                    findNavController().navigate(R.id.action_enterDetailsFragment_to_verifyDetailsFragment,bundle)*/
                    findNavController().navigate(
                            EnterDetailsFragmentDirections.actionEnterDetailsFragmentToVerifyDetailsFragment(
                                    inputName,
                                    inputJob,
                                    inputNoPhone.toLong()
                            )
                    )
                }
            }


        }
        return binding.root
    }

}



