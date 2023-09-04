package Animaux

open class Animal(nom: String, type: String) {
    val nom: String = ""

    fun faireDuBruit() {
        println("Bruitage de l'animal $nom")
    }
}