package Compte

class CompteBancaire {

    public var numeroCompteBancaire : Int = 0
    private var solde : Double = 0.0

    fun deposer(montant: Double) {
        if (numeroCompteBancaire == 777) {
            solde += montant
            println("Votre montant a bien été déposé !")
        }else {
            println("Compte non défini")
        }
    }

    fun retirer(montant: Double) {
        if (numeroCompteBancaire == 777) {
            if (solde >= montant) {
                solde -= montant
                println("Votre montant a bien été retiré !")
            } else {
                println("Solde insuffisant")
            }
        }else {
            println("Compte non défini")
        }
    }

    fun consulterSolde() {
        if (numeroCompteBancaire == 777) {
            println("Solde : $solde")
        }else {
            println("Compte non défini")
        }
    }
}