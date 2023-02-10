fun main(args: Array<String>) {
    println("Hello World!")

    println("\n\n *** Les types de bases ***")
    var nom : String = "Kevin Leduc"
    var age : Int = 25 //NO JUDGEMENT
    var salaireProf : Number? = 21.65 //Mais ben de l'amour :3
    var gentil : Boolean = true

    println("Bonjour!, je m'appel $nom, j'ai $age ans, je gagne $salaireProf)")
    if (age > 25 && gentil) {
        println("En passant, je suis gentil et majeur")
    }

    println("\n\n *** Les ArrayList et les objets sans le mots new!")

    var unPokemon = Pokemon(7, "Carapuce", "Water")
    println("Je me nomme ${unPokemon.nom} je suis de type ${unPokemon.type}")

    var listeAvecDesDonneesPrimitif = listOf(4,2,3,4,5)
    var listeAvecDesObjets = listOf(Pokemon(1,"Bulbizarre", "Grass"),
                                    Pokemon(6, "Dracaufeu", "Fire"))

    println("\n\n *** Les boucles de plein de manière")

    listeAvecDesDonneesPrimitif.forEach {
        println("Le nombre : $it")
    }

    listeAvecDesObjets.forEach {
        println("Le pokémon : ${it.nom}")
    }

    for (unPokemon in listeAvecDesObjets) {
        println("Le pokémon : ${unPokemon.nom}")
    }

    for(i in 1..100) {
        println(i)
    }

    println("\n\n *** Les fonctions lambdas! ")
    var fonctionMystere1 : () -> Unit = { println("Je suis le meilleur maitre pokémon")}
    fonctionMystere1()

    var fonctionMystere2 : (Int, Int) -> Int = { unNombre: Int, unAutreNombre: Int -> unNombre + unAutreNombre }
    println(fonctionMystere2(5,6))


    println("\n\n *** Les fonctions lambdas passées en paramètres appelant d'autres fonctions lambdas! ")
    MaPetitePage {
        Text(text = "Allo la classe!")
        Image(url = "URL d'un chat mignon!")
        Button(onClick = {
            //partir un Intent pour ouvrir une nouvelle activitée
        }) {
            Text("Cliquez pour continuer!")
        }
    }

    println("FIN!")
}


//Une classe servant à contenu des DONNÉES uniquement (sans fonction)
data class Pokemon(val id : Int,
                   val nom : String,
                   val type : String)


//Une classe classique
class PokemonVersion2 {
    val id : Int
    val nom : String
    val type : String

    constructor(id : Int, nom : String, type : String) {
        this.id = id
        this.nom = nom
        this.type = type
    }

    fun MaMethode1() : Int {
        return 42
    }

    fun MaMethode2() : Unit {
        println("Méthode retournant rien")
    }
}


fun MaPetitePage(width : Int = 600, height : Int = 800, contenuEnfant : () -> Unit) {
    //Logique pour créer le visuel du composant X ici
}

fun Text(text : String, fontSize : Int = 14, onClick : (() -> Unit)? = null) {
    //Logique pour créer visuellement le composant Text
}

fun Image(url : String, fontSize : Int = 14, onClick : (() -> Unit)? = null) {
    //Logique pour créer visuellement le composant Text
}

fun Spacer(size : Int = 1) {
    //Logique pour créer visuellement le composant Spacer
}

fun Button(backgroundColor : String = "#FFFFFF", onClick : (() -> Unit)? = null, contenuEnfant : () -> Unit) {
    //Logique pour créer visuellement le composant Button
}