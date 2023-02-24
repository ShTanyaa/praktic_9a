import examen.*
class Oge (var followers:Int,var pay:Boolean,var empnazvanie:String,var empname:String,var empdata:String,var empmark:Int):Exam(empnazvanie,empname,empdata,empmark) {

    open fun neww(){
        if(followers>2000) println("этот видеокурс по подготовке к огэ популярный")
    }
    open fun cost (){
        if(pay==true) println("этот курс платный")
    }
}