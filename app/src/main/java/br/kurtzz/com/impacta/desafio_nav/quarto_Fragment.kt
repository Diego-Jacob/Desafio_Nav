package br.kurtzz.com.impacta.desafio_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.kurtzz.com.impacta.desafio_nav.databinding.FragmentQuartoBinding

class quarto_Fragment : Fragment()
{
    private var _binding: FragmentQuartoBinding? = null
    private val binding: FragmentQuartoBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuartoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonQuartoFrag.setOnClickListener {
            findNavController().navigate(R.id.action_quarto_Fragment_to_primeiro_Fragment2)
        }
    }
}
