package FormeAbst

class Carre(val cote: Double) : Forme() {
    override fun aire(): Double {
        return cote * cote
    }
}