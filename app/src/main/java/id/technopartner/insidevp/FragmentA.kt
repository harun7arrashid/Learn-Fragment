package id.technopartner.insidevp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import id.technopartner.insidevp.databinding.FragmentABinding

class FragmentA : Fragment() {

    private var binding: FragmentABinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = bundleOf()
        val args   = Bundle()

        binding?.btnAdd?.setOnClickListener {

            bundle.putString(FragmentB.KEY_MANTAP, Calculation.ADD.valueHehe)
            findNavController().navigate(R.id.calculations, bundle)

        }

        binding?.btnSubtract?.setOnClickListener {

            bundle.putString(FragmentB.KEY_MANTAP, Calculation.SUBTRACT.valueHehe)
            findNavController().navigate(R.id.calculations, bundle)

        }

        // onActivityResult versi Fragment
        findNavController().currentBackStackEntry?.savedStateHandle?.let { handle ->

            handle.getLiveData<Int>(FragmentB.RESULT).observe(viewLifecycleOwner, {
                binding?.tvResult?.text = it.toString()
            })

        }

    }
}