import examen.*
class Students (var who:String,var empnazvanie:String,var empname:String,var empdata:String,var empmark:Int):Exam(empnazvanie,empname,empdata,empmark) {

    open fun prediction() {
       if(who=="отличник") println("этот студент сдаст экзамен очень хорошо")
    }
    open fun rexam (){
        if(empmark==2) println("студент идет на пересдачу")
    }
}