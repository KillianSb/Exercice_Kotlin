package Animaux

class Chat(nom: String) : Animal(nom, "Chat") {
    fun parler() {
        println("$nom miaule : Miaou!")
    }

    fun chasserSouris() {
        println("$nom chasse une souris.")
    }
}