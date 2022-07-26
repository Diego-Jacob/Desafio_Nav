package br.kurtzz.com.impacta.desafio_nav

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import br.kurtzz.com.impacta.desafio_nav.databinding.FragmentPrimeiroBinding
import kotlin.random.Random


class Primeiro_Fragment : Fragment() {

    private var _binding: FragmentPrimeiroBinding? = null
    private val binding: FragmentPrimeiroBinding get() = _binding!!
    private val args: Primeiro_FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPrimeiroBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var random: Int = args.random

       val numeroRandom = if (random == -1)
       { Random.nextInt(0,10)} else
       {random}

        Toast.makeText(context,"Número digitado: $numeroRandom e $random", Toast.LENGTH_SHORT).show()

        binding.buttonPrimeiroFrag.setOnClickListener {

            if (binding.editTextNumber.text.isEmpty())
            {
                binding.editTextNumber.error = "Digite um número."
            } else
            if (binding.editTextNumber.text.toString().toInt() == numeroRandom)
            {
                var texto = "Parabéns\nVocê Acertou!!!"
                var action = Primeiro_FragmentDirections.actionPrimeiroFragmentToQuartoFragment2(texto)
                findNavController().navigate(action)
            } else
            if (binding.editTextNumber.text.toString().toInt() > numeroRandom)
            {
                var texto = "Chute muito alto\nTente de novo!!"
                var action = Primeiro_FragmentDirections.actionPrimeiroFragmentToSegundoFragment2(numeroRandom, texto)
                findNavController().navigate(action)
            } else
            {
                var texto = "Chute muito baixo\nTente de novo!!"
                var action = Primeiro_FragmentDirections.actionPrimeiroFragmentToTerceiroFragment2(numeroRandom, texto)
                findNavController().navigate(action)
            }
        }
    }

}
