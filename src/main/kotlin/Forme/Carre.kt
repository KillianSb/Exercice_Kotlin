package Forme

class Carre(val longueurCote: Double) : Forme() {

    override fun afficher() {
        println("Carré de côté $longueurCote cm")
    }
}