package androideduio.com.listsample.ui

import android.app.FragmentTransaction
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import androideduio.com.listsample.R

class DashboardActivity : AppCompatActivity() {

    private var fragmentManager: FragmentManager? = null
    private var fragmentTransaction: android.support.v4.app.FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        fragmentManager = supportFragmentManager

        fragmentTransaction = fragmentManager!!.beginTransaction()

     //   var fragmentListView = ListViewFragment()
        var fragmentListView=RecyclerViewFragment()


        fragmentTransaction!!.add(R.id.activity_dashboard_frmFragment,fragmentListView)


        fragmentTransaction!!.commit()



    }
}

