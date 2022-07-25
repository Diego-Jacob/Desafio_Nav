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
        var numeroRandom = Random.nextInt(0,10)
        var guardaRandom: Int = numeroRandom
        var random: Int = args.random


        //if (random != numeroRandom) guardaRandom = random

        binding.textViewTeste.text = numeroRandom.toString() + random

        binding.buttonPrimeiroFrag.setOnClickListener {

            var numeroDigitado = binding.editTextNumber.text.toString().toInt()
            if (binding.editTextNumber.text.toString() == null) {
                Toast.makeText(context,"Digite um número", Toast.LENGTH_SHORT).show()
            }else
            if (numeroDigitado == guardaRandom) {
                var texto = "Parabéns\nVocê Acertou!!!"
                var action = Primeiro_FragmentDirections.actionPrimeiroFragmentToQuartoFragment2(texto)
                findNavController().navigate(action)}else
            if (numeroDigitado > guardaRandom)
            {
                var texto = "Chute muito alto\nTente de novo!!"
                var action = Primeiro_FragmentDirections.actionPrimeiroFragmentToSegundoFragment2(guardaRandom, texto)
                findNavController().navigate(action)}
            else
            {
                var texto = "Chute muito baixo\nTente de novo!!"
                var action = Primeiro_FragmentDirections.actionPrimeiroFragmentToTerceiroFragment2(guardaRandom, texto)
                findNavController().navigate(action)}
        }
    }

}
