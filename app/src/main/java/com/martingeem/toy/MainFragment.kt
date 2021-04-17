package com.martingeem.toy

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

/**
 *
 * @author youngsong.kim (youngsong.kim@navercorp.com)
 * @since 2021/04/17
 */
class MainFragment : Fragment() {
    private var fragId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fragId = arguments?.getInt("fragId") ?: 0
        Log.d("geeks", "[onCreate] fragId:$fragId")
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        Log.d("geeks", "[onCreateView] fragId:$fragId")

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val tv = view.findViewById<TextView>(R.id.tv_frag_id)
        tv.text = "FragId ==> $fragId"

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("geeks", "[onViewCreated] fragId:$fragId")
    }

    override fun onStart() {
        super.onStart()

        Log.d("geeks", "[onStart] fragId:$fragId")
    }

    override fun onResume() {
        super.onResume()

        Log.d("geeks", "[onResume] fragId:$fragId")
    }

    override fun onPause() {
        super.onPause()

        Log.d("geeks", "[onPause] fragId:$fragId")
    }

    override fun onStop() {
        super.onStop()

        Log.d("geeks", "[onStop] fragId:$fragId")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("geeks", "[onDestroy] fragId:$fragId")
    }

    companion object {
        fun newInstance(id: Int): MainFragment {
            return MainFragment().apply {
                arguments = Bundle().apply {
                    putInt("fragId", id)
                }
            }
        }
    }
}