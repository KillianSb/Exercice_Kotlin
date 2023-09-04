package Animaux

class Chien(nom: String) : Animal(nom, "Chien") {
    fun parler() {
        println("$nom aboie : Woof! Woof!")
    }

    fun courir() {
        println("$nom court après une balle.")
    }
}