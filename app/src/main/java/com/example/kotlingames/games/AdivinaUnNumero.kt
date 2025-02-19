package com.example.kotlingames.games

//Adivina un numro
//Se debe selefccionar un numero dentro de un rango
//La computadora debe ser capaz de seleccionar ese numero
//El programa debe solicitar al usuario ingresar las suposiciones
//Debe de asegurarse recibir numeros validos
//El juego termina cuando el jugador acierta el numero

fun main(){
    val range = 1..10
    val numberToGuess = range.random()
    var attemps = 0

    println("Bienvenid@ al juego de Adivina un Numero")
    println("Estoy pensando en un numero entre 1 y 10. Adivinalo")
    //? --- si el primero es nulo el segundo no se ejecuta
    //readlnOrNull()!.toIntOrNull()-----estamos completamente seguros que el primero no es nulo


    do{
        println("Ingresa tu suposicion")
        var guess = readlnOrNull()?.toIntOrNull()

        if(guess != null){
            attemps ++
            when{
                guess < numberToGuess -> println("El numero que estoy pensando es mayor")
                guess > numberToGuess -> println("El numero que estoy pensando es menor")
                else -> println("Felicidades,adivinaste en $attemps intentos")
            }
            //El numero que me pasaron es valido
//            if(guess == numberToGuess){
//                println("Felicidades,adivinaste")
//            }else if (guess > numberToGuess){
//                println("El numero que estoy pensando es menor")
//            }else if {
//                println("printlnEl numero que estoy pensando es mayor")
//            }

        }else{
            //No es numero
            println("Por favor ingrese un numero valido")
        }
    }while(guess != numberToGuess)
}