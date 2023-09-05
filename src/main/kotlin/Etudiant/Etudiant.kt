package Etudiant

import kotlin.properties.Delegates

class Etudiant {
    lateinit var nom: String
    var age: Int = 0
    lateinit var numeroEtudiant: String
}

fun main() {

    // Demandez à l'utilisateur de saisir les informations sur le produit
    println("Veuillez saisir les informations sur le produit :")

    val etudiant = Etudiant()
    print("Nom : ")
    etudiant.nom = readLine() ?: ""

    print("Age : ")
    etudiant.age = (readlnOrNull() ?: 0) as Int

    print("Numero Etudiant : ")
    etudiant.numeroEtudiant = readLine() ?: ""

    println(etudiant)
}