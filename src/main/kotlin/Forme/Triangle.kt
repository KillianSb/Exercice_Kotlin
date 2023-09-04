package Forme

class Triangle(val base: Double, val hauteur: Double) : Forme() {

    override fun afficher() {
        println("Triangle de base $base cm et de hauteur $hauteur cm")
    }
}