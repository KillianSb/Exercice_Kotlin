package Personne

fun main(args: Array<String>) {
    val personne = Personne("John Doe", 30, "Développeur")

    // Accéder aux propriétés de la personne
    println("Nom: ${personne.nom}")
    println("Age: ${personne.age}")
    println("Poste: ${personne.poste}")

    println(" ")

    val personne2 = Personne2("Alice Smith")
    println("Nom: ${personne2.nom}")
    println("Age: ${personne2.age}")
    println("Poste: ${personne2.poste}")
}