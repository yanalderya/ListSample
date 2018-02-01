package androideduio.com.listsample.singleton

import androideduio.com.listsample.models.StudentInfo

/**
 * Created by DELL on 27.01.2018.
 */
object AppUtil {

    fun getStudentList(): ArrayList<StudentInfo> {

        val studentList = ArrayList<StudentInfo>()

        var studentInfo = StudentInfo(1234, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Derya Yanal", "Namık Kemal Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Mustafa Yanal", "Trakya Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Ali Sezgi", "Namık Kemal Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Derya Yanal", "Namık Kemal Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Mustafa Yanal", "Trakya Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Ali Sezgi", "Namık Kemal Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234, "Gökhan Öztürk", "Maltepe Üniversitesi")
        studentList.add(studentInfo)

        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Derya Yanal", "Namık Kemal Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Mustafa Yanal", "Trakya Üniversitesi")
        studentList.add(studentInfo)

        studentInfo = StudentInfo(1234124, "Ali Sezgi", "Namık Kemal Üniversitesi")
        studentList.add(studentInfo)

        return studentList
    }
}