package Animaux

class Dauphin(nom: String) : Animal(nom, "Dauphin"), Nageur {
    fun parler() {
        println("$nom émet des sons aquatiques.")
    }
}