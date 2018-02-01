package androideduio.com.listsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androideduio.com.listsample.R
import androideduio.com.listsample.models.StudentInfo


/**
 * Created by DELL on 1.02.2018.
 */
class StudentListAdapterRV(val studentList: ArrayList<StudentInfo>) : RecyclerView.Adapter<StudentListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StudentListViewHolder {

        val convertView = LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentlist_item, parent, false)
        return StudentListViewHolder(convertView)
    }

    override fun onBindViewHolder(holder: StudentListViewHolder?, position: Int) {

        holder!!.txtStudentNumber.text = studentList[position].studentNumber.toString()
        holder.txtStudentName.text = studentList[position].studentName
        holder.txtStudentSchool.text = studentList[position].studentSchool

    }

    override fun getItemCount(): Int = studentList.size
}