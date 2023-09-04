package Animaux

fun main(args: Array<String>) {
    val rex = Chien("Rex")
    val whiskers = Chat("Whiskers")
    val soar = Aigle("Soar")
    val flipper = Dauphin("Flipper")

    rex.parler()
    rex.courir()

    whiskers.parler()
    whiskers.chasserSouris()

    soar.parler()
    soar.vole()

    flipper.parler()
    flipper.nager()
}