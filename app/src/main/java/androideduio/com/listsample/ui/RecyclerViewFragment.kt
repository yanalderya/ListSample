package androideduio.com.listsample.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androideduio.com.listsample.R
import androideduio.com.listsample.adapter.StudentListAdapterRV
import androideduio.com.listsample.singleton.AppUtil


/**
 * A simple [Fragment] subclass.
 * Use the [RecyclerViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecyclerViewFragment : Fragment() {

    private lateinit var masterView: View

    private val recyclerView: RecyclerView by lazy { masterView.findViewById<RecyclerView>(R.id.fragment_recycler_view) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        masterView= inflater!!.inflate(R.layout.fragment_recycler_view, container, false)

        val layoutManager=LinearLayoutManager(activity)

        recyclerView.layoutManager=layoutManager

        val studentRecyclerAdapter=StudentListAdapterRV(AppUtil.getStudentList())

        recyclerView.adapter=studentRecyclerAdapter

        return masterView

    }



}
