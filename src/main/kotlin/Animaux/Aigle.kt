package Animaux

class Aigle(nom: String) : Animal(nom, "Aigle"), Voleur {
    fun parler() {
        println("$nom pousse un cri d'aigle : Screeeech!")
    }
}