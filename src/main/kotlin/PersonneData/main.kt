package PersonneData

fun main() {
    var personne1 = Personne("John Doe", 30)
    var personne2 = Personne("Alice Smith", 30)
    var personne3 = Personne("John Doe", 30)

    if (personne1.hashCode() == personne2.hashCode()) {
        println("Les deux personnes sont identiques")
    }else {
        println("Les deux personnes ne sont pas identiques")
    }

    if (personne1.hashCode() == personne3.hashCode()) {
        println("Les deux personnes sont identiques")
        println("HashCode de personne1 : ${personne1.hashCode()}")
        println("HashCode de personne2 : ${personne2.hashCode()}")
        println("HashCode de personne1 : ${personne1.toString()}")
        println("HashCode de personne2 : ${personne2.toString()}")

    }else {
        println("Les deux personnes ne sont pas identiques")
    }
}