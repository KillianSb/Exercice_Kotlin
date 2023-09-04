package Produit

fun main(args: Array<String>) {
    // Déclaration des variables pour stocker les informations sur le produit
    var nomProduit: String
    var prixProduit: Float
    var quantiteStock: Int
    var codeProduit: Int
    var produitEnPromotion: Boolean
    var quantiteAchat: Int
    val remise: Float
    var prixTotal: Float

    // Demandez à l'utilisateur de saisir les informations sur le produit
    println("Veuillez saisir les informations sur le produit :")

    print("Nom du produit : ")
    nomProduit = readLine() ?: ""

    print("Prix du produit : ")
    prixProduit = readLine()?.toFloatOrNull() ?: 0.0f

    print("Quantité en stock : ")
    quantiteStock = readLine()?.toIntOrNull() ?: 0

    print("Code du produit : ")
    codeProduit = readLine()?.toIntOrNull() ?: 0

    print("Produit en promotion (true/false) : ")
    produitEnPromotion = readLine()?.toBoolean() ?: false

    print("Quantité d'achat : ")
    quantiteAchat = (readLine()?.toIntOrNull() ?: 0)
    if (quantiteAchat > quantiteStock) {
        println("Impossible de commander plus que la quantité du stock ! Ressayer")
        print("Quantité d'achat : ")
        quantiteAchat = (readLine()?.toIntOrNull() ?: 0)
    }

    // Afficher les informations du produit saisies par l'utilisateur
    println("\nInformations sur le produit saisi :")
    println("Nom du produit : $nomProduit")
    println("Prix du produit : $prixProduit")
    println("Quantité en stock : $quantiteStock")
    println("Code du produit : $codeProduit")
    println("Produit en promotion : $produitEnPromotion")
    println("Quantité d'achat : $quantiteAchat")
    prixTotal = prixProduit * quantiteAchat
    if (produitEnPromotion == true) {
        remise = (prixTotal * 0.10).toFloat() // 10% de réduction
        prixTotal -= remise // Mettre à jour le prix total avec la réduction
        println("Produit en promotion ! 10% de remise appliquée.")
    }
    println("Prix total : $prixTotal €")
}