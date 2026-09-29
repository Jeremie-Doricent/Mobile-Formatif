package org.example

fun lireAge(): Int {
    var age: Int? = null
    while (age == null) {
        println("Veuillez entrer votre âge : ")
        val lecture = readln()
        val temp = lecture.toIntOrNull()

        if (temp == null) {
            println("Entrée invalide, veuillez réessayer.")
        } else if (temp < 0 || temp > 120) {
            println("Âge invalide, veuillez réessayer.")
        } else {
            age = temp
        }
    }
    return age
}