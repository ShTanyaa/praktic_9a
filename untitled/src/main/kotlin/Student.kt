import magazine.*
class Student (var nom:Int,var mark:Int,var predm:String,empname:String,empnum:Int,empdata:Int):Info(empname,empnum,empdata) {

    open fun information() {
        println("студент номер ${nom} получил оценку ${mark} по экзамену - ${predm}")
    }
    open fun rez(){
        if(mark>2) println("студент сдал экзамен")
        else println("студент не сдал экзамен")
    }
}