import examen.Exam
import examen.Exam as NewExam

fun main(args:Array<String>) {
    var exam1 = Exam("математика", "Андрей петров", "25 ноября", 5)
    exam1.rez()
    exam1.info()
    println()
    var exam2 = Students("отличник", "английский язык", "Настя Васильева", "12 января", 3)
    exam2.rez()
    exam2.info()
    exam2.prediction()
    exam2.rexam()
    println()
    var exam3 = Oge(3500, true, "вебинар по подготовке к огэ", "Данир Баев", "27 марта", 4)
    exam3.rez()
    exam3.info()
    exam3.neww()
    exam3.cost()
}