class Banque {
    inner class Compte(val numero: Int, var solde: Double) {
        inner class Transaction(val montant: Double, val type: String) {
            fun afficherTransaction() {
                println("$type de $montant €")
            }
        }

        fun effectuerDepot(montant: Double) {
            solde += montant
            Transaction(montant, "Dépôt").afficherTransaction()
        }

        fun effectuerRetrait(montant: Double) {
            if (solde >= montant) {
                solde -= montant
                Transaction(montant, "Retrait").afficherTransaction()
            } else {
                println("Solde insuffisant pour effectuer le retrait de $montant €")
            }
        }
    }
}

fun main() {
    val banque = Banque()
    val compte1 = banque.Compte(1001, 1500.0)
    val compte2 = banque.Compte(1002, 2500.0)

    compte1.effectuerDepot(500.0)
    compte2.effectuerRetrait(1000.0)
    compte1.effectuerRetrait(2000.0)

    println("Solde du compte 1 : ${compte1.solde} €")
    println("Solde du compte 2 : ${compte2.solde} €")
}
