package Forme

class Cercle(val rayon: Double) : Forme() {

    override fun afficher() {
        println("Cercle de rayon $rayon cm")
    }
}