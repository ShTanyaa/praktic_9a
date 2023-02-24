package  examen

open class Exam (var nazvanie:String,var name:String,var data:String,var mark:Int){

    open fun rez(){
        if(mark>2) println("студент сдал экзамен")
        else println("студент не сдал экзамен")
    }
    open fun info(){
        println("информация о экзамене")
        println("экзамен по ${nazvanie} состоится ${data} ")
    }
}