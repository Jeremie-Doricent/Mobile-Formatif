package org.example


import java.io.File
import java.net.URI
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
fun main(args: Array<String>) {
    val fichier = File(args[0])
    var somme = 0

    fichier.forEachLine { line ->
        val nombre = line.trim().toIntOrNull()
        if (nombre != null) {
            println(nombre)
            somme += nombre
        }
    }

    println("Somme des nombres : $somme")
}
