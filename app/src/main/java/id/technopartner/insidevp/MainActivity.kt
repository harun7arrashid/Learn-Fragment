package id.technopartner.insidevp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import id.technopartner.insidevp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val NUM_ITEMS = 2
    private lateinit var mPagerAdapter: SlidePagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mPagerAdapter = SlidePagerAdapter(supportFragmentManager)
        binding.pager.adapter = mPagerAdapter

        binding.pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {

                if (position > 1) {

//                    for (i in 0 until supportFragmentManager.backStackEntryCount) {
//                        supportFragmentManager.popBackStack()
//                    }

                }
            }
        })

    }

    inner class SlidePagerAdapter(val fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {

            return if (position == 0) {
                RootFragment() // this is where we create a RootFragment acting as a container for other fragment
            } else StaticFragment()

        }

        override fun getCount(): Int = NUM_ITEMS

    }
}