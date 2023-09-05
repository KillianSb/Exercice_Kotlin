package PersonneData

data class Personne(val nom: String, val age: Int) {

    override fun toString(): String {
        return "Personne(nom='$nom', age=$age)"
    }
}

