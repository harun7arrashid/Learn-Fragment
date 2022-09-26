package id.technopartner.insidevp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.technopartner.insidevp.databinding.FragmentRootBinding


class RootFragment : Fragment() {

    private var binding: FragmentRootBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRootBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val transaction = parentFragmentManager.beginTransaction()
        // Ketika wadah fragment ini dibuat, kita akan mengisinya dgn fragment child nya
        transaction?.replace(R.id.root_frame, FirstFragment())
        transaction?.commit()

    }

}