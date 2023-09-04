package Compte

fun main(args: Array<String>) {
    val compte = CompteBancaire()

    compte.numeroCompteBancaire = 777

    compte.deposer(1000.0)

    print("Vous avez :")
    compte.consulterSolde()

    println(" ")

    compte.retirer(100.0)

    print("Vous avez :")
    compte.consulterSolde()
}