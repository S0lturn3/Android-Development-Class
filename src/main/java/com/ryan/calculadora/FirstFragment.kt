package com.ryan.calculadora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ryan.calculadora.databinding.FragmentFirstBinding

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

        var x1: Float
        var x2: Float

        binding.btnSomar.setOnClickListener {
            x1 = binding.number1.text.toString().toFloat()
            x2 = binding.number2.text.toString().toFloat()

            var text = x1 + x2

            binding.resultText.text = text.toString()
        }

        binding.btnSubtrair.setOnClickListener {
            x1 = binding.number1.text.toString().toFloat()
            x2 = binding.number2.text.toString().toFloat()

            var text = x1 - x2

            binding.resultText.text = text.toString()
        }

        binding.btnMultiplicar.setOnClickListener {
            x1 = binding.number1.text.toString().toFloat()
            x2 = binding.number2.text.toString().toFloat()

            var text = x1 * x2

            binding.resultText.text = text.toString()
        }

        binding.btnDividir.setOnClickListener {
            x1 = binding.number1.text.toString().toFloat()
            x2 = binding.number2.text.toString().toFloat()

            var text = x1 / x2

            binding.resultText.text = text.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}