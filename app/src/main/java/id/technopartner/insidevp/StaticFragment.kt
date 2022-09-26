package id.technopartner.insidevp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.technopartner.insidevp.databinding.FragmentStaticBinding


class StaticFragment : Fragment() {

    private var binding: FragmentStaticBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentStaticBinding.inflate(inflater, container, false)
        return binding?.root
    }


}