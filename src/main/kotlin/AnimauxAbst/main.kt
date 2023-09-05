package AnimauxAbst

fun main() {
    // Créez un tableau d'animaux contenant des objets de chaque sous-classe
    val animaux = arrayOf<Animal>(Chien(), Chat())

    // Parcourez le tableau et appelez la méthode faireDuBruit() pour afficher les bruits de chaque animal
    for (animal in animaux) {
        animal.faireDuBruit()
    }
}