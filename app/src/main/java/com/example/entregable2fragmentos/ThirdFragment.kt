package com.example.entregable2fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.entregable2fragmentos.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

//Aquí copie el fragmento 1 y renombre las clases de first a third
class ThirdFragment : Fragment() {
                            //Esto tambien lo renombre
    private var _binding: FragmentThirdBinding? = null

    //Aqui ponemos la variable que nos da un valor entre uno o dos para navegar luego al
    //fragmento 4 o 5
    val pago=(0 until 2).random()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
                    //Esto tambien lo renombre
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Aquí el if por si sale uno o dos la variable pago.
        binding.button3.setOnClickListener {
            if (pago==1) {
                findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment)
            }else{
                findNavController().navigate(R.id.action_thirdFragment_to_fifthFragment)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}