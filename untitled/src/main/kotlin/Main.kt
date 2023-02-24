import magazine.Info
import magazine.Info as NewInfo

fun main(args:Array<String>){
    var info1=Info("Look",2,2010)
    info1.old()
    info1.numb()
    info1.inf()
    println()
    var info2=Mgzn("образование","Данир Баев", 2,"подготовка к огэ",2,2015)
    info2.old()
    info2.numb()
    info2.inff()
    info2.neww()
    info2.inf()
    println()
    var info3=Student(6,4, "математика","подготовка к огэ",2,2020)
    info3.old()
    info3.numb()
    info3.information()
    info3.rez()
    info3.inf()
}
