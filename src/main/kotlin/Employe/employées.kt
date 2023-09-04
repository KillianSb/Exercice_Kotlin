package Employe

fun main(args: Array<String>) {
    val employee1 = Employee("John Cooper", 30, "Manager", 1500.0f)
    val employee2 = Employee("Laura Smith", 30, "Comptable", 1100.0f)
    val employee3 = Employee("Mick Clark", 30, "Développeur", 1300.0f)
    afficherInformations(employee1)
    afficherInformations(employee2)
    afficherInformations(employee3)
}
fun afficherInformations(employee: Employee) {
    employee.afficherInformations()
    employee.augmenterSalaire()
    employee.afficherInformations()
}