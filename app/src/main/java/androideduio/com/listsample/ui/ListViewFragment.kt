package androideduio.com.listsample.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import androideduio.com.listsample.R
import androideduio.com.listsample.adapter.StudentListAdapter
import androideduio.com.listsample.singleton.AppUtil

/**
 * Created by DELL on 28.01.2018.
 */

class ListViewFragment:Fragment(), AdapterView.OnItemClickListener {
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var masterView : View? = null
    private val listView: ListView by lazy { masterView!!.findViewById<ListView>(R.id.fragment_student_list_view) }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        masterView=inflater!!.inflate(R.layout.fragment_list_view,container,false)

        val studentListAdapter=StudentListAdapter(AppUtil.getStudentList())

        listView.adapter=studentListAdapter

        listView.onItemClickListener=this

        return  masterView


    }


}