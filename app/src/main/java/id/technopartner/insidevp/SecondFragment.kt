package id.technopartner.insidevp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import id.technopartner.insidevp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {

            btnToStatic.setOnClickListener {

                val trans = parentFragmentManager.beginTransaction()
                trans?.replace(R.id.root_frame, StaticFragment())
                trans?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                trans?.addToBackStack(null)
                trans?.commit()

            }

        }

    }
}