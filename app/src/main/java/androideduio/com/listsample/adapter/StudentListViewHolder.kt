package androideduio.com.listsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import androideduio.com.listsample.R
import kotlinx.android.synthetic.main.adapter_studentlist_item.view.*

/**
 * Created by DELL on 1.02.2018.
 */
class StudentListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val txtStudentNumber: TextView by lazy { itemView.findViewById<TextView>(R.id.adapter_studentNumber) }
    val txtStudentName:TextView by lazy { itemView.findViewById<TextView>(R.id.adapter_studentName) }
    val txtStudentSchool: TextView by lazy { itemView.findViewById<TextView>(R.id.adapter_studentSchool) }

}