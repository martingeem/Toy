package com.martingeem.toy

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 *
 * @author youngsong.kim (youngsong.kim@navercorp.com)
 * @since 2021/04/17
 */
class MainPagerAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("geeks2", "[createFragment] position:$position")

        return MainFragment.newInstance(position)
    }
}