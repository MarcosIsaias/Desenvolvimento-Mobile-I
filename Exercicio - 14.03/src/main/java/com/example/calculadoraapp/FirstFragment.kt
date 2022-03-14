package com.example.calculadoraapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.calculadoraapp.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var x1 : Float
        var x2 : Float

        binding.soma.setOnClickListener {
            x1 = binding.telaCalculo.text.toString().toFloat()
            x2 = binding.telaCalculo2.text.toString().toFloat()

            var text = x1+x2

            binding.telaResultado.text = text.toString()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}