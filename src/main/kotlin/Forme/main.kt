package Forme

fun main() {
    val cercle = Cercle(5.0)
    val carre = Carre(4.0)
    val triangle = Triangle(3.0, 6.0)

    // Créez un tableau de formes contenant des objets de différentes classes de formes
    val formes = arrayOf<Forme>(cercle, carre, triangle)

    // Parcourez le tableau et appelez la méthode afficher() pour chaque forme
    for (forme in formes) {
        forme.afficher()
    }
}