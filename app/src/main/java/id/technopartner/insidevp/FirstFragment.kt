package id.technopartner.insidevp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import id.technopartner.insidevp.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {

            // FirstFragment.kl, the first fragment lives inside the RootFragment, clicking the button on this fragment will replace this fragment with SecondFragment.kl
            binding?.btnToSecond?.setOnClickListener {

                val trans = parentFragmentManager.beginTransaction()

                // We use the "root frame"  defined in "fragment_root.xml" as the reference to replace fragment
                trans?.replace(R.id.root_frame, SecondFragment())

                // The following lines allow us to add the fragment to the stack and return to it later, by pressing back
                trans?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                trans?.addToBackStack(null)
                trans?.commit()

            }
        }
    }


}