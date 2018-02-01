package androideduio.com.listsample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.TextView
import androideduio.com.listsample.R
import androideduio.com.listsample.models.StudentInfo
import java.text.FieldPosition

/**
 * Created by DELL on 28.01.2018.
 */

class StudentListAdapter(val studentList : ArrayList<StudentInfo>): BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


        val masterView = convertView?: LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentlist_item,parent,false)

        val txtStudentNumber=masterView.findViewById<TextView>(R.id.adapter_studentNumber)
        val txtStudentName=masterView.findViewById<TextView>(R.id.adapter_studentName)
        val txtStudentSchool=masterView.findViewById<TextView>(R.id.adapter_studentSchool)


        txtStudentNumber.text= studentList[position].studentNumber.toString()
        txtStudentName.text=studentList[position].studentName
        txtStudentSchool.text=studentList[position].studentSchool


        return masterView!!
    }

    override fun getItem(position: Int): StudentInfo =studentList[position]

    override fun getItemId(position: Int): Long = 0

    override fun getCount(): Int=studentList.size

}