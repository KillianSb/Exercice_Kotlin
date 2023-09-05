package FormeAbst

class Triangle(val base: Double, val hauteur: Double) : Forme() {
    override fun aire(): Double {
        return 0.5 * base * hauteur
    }
}