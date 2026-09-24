package org.example

fun main(args: Array<String>) {
    var nombre:Int = lireNombre()
}

fun lireNombre() : Int{
    var nombre = 0
    while(nombre ==0 ){
        println("Veuillez entrer votre nombre entier : ")
        var lecture:String = readln()
        nombre = lecture.toInt()
    }
    return nombre
}
