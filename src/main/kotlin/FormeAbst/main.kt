package FormeAbst

fun main() {
    val cercle = Cercle(5.0)
    val carre = Carre(4.0)
    val triangle = Triangle(3.0, 6.0)

    println("Aire du cercle : ${cercle.aire()}")
    println("Aire du carré : ${carre.aire()}")
    println("Aire du triangle : ${triangle.aire()}")
}