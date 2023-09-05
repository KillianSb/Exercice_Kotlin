package FormeAbst

class Cercle(val rayon: Double) : Forme() {
    override fun aire(): Double {
        return Math.PI * rayon * rayon
    }
}