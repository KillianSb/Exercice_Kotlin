package Personne

class Personne(val nom: String, val age: Int, val poste: String) {

}

class Personne2() {
    var nom: String = ""
    var age = 0
    var poste = "Non défini"

    constructor(nom : String) : this() {
        this.nom = nom
    }

    constructor(nom: String, age: Int, poste: String) : this() {
        this.nom = nom
        this.age = age
        this.poste = poste
    }

    override fun toString(): String {
        return "nom='$nom', age=$age, poste='$poste')"
    }


}