package org.example
import java.io.File
import java.net.URI
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
fun main(args: Array<String>) {
    val url = "https://info.cegepmontpetit.ca/3M5-Intro-Mobile/testbot/lotr.html"

    try {
        // Étape 1-2 : télécharger et parser le HTML
        val document = Jsoup.connect(url).get()

        // Étape 3 : sélectionner toutes les balises <img>
        val images = document.select("img")

        // Étape 4 : extraire et afficher src >> alt
        for (img in images) {
            val src = img.attr("src")
            val alt = img.attr("alt")
            println("$src >> $alt")
        }

    } catch (e: Exception) {
        println("Erreur lors du chargement de la page : ${e.message}")
    }
}
