package id.technopartner.insidevp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import id.technopartner.insidevp.databinding.FragmentBBinding


class FragmentB : Fragment() {

    companion object {

        const val KEY_MANTAP = "keyMantap"
        const val RESULT = "keyResult"

    }

    private var binding: FragmentBBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val type = arguments?.getString(KEY_MANTAP)

        binding?.apply {

            btnCalculate.setOnClickListener {

                if (!etFirst.text.isNullOrBlank() and !etSecond.text.isNullOrBlank()) {

                    val resultAdd = etFirst.text.toString().toInt() + etSecond.text.toString().toInt()
                    val resultSubtract = etFirst.text.toString().toInt() - etSecond.text.toString().toInt()

                    when (type) {

                        Calculation.ADD.valueHehe -> findNavController().apply {
                            previousBackStackEntry?.savedStateHandle?.set(RESULT, resultAdd)
                        }.navigateUp()

                        else -> findNavController().apply {
                            previousBackStackEntry?.savedStateHandle?.set(RESULT, resultSubtract)
                        }.navigateUp()

                    }

                }

//                findNavController().apply {
//                    previousBackStackEntry?.savedStateHandle?.set("Mantap", "Harun Arrashid")
//                }.navigateUp()

            }

        }

    }

}