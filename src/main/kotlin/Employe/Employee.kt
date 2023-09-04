package Employe

class Employee(val nom: String, var age: Int, var poste: String, var salaire: Float) {

    fun afficherInformations() {
        println("Nom: $nom")
        println("Age: $age")
        println("Poste: $poste")
        println("Salaire: $salaire")
    }

    fun augmenterSalaire() {
        if (poste == "Manager") {
            salaire += salaire * 0.10f
            println("Salaire augmenté de 10%")
        }
        if (poste == "Développeur") {
            salaire += salaire * 0.15f
            println("Salaire augmenté de 15%")
        }
        if (poste == "Comptable") {
            salaire += salaire * 0.12f
            println("Salaire augmenté de 12%")
        }
    }
}