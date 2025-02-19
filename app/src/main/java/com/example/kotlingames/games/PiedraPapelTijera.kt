package com.example.kotlingames.games

/* El programa solcitar al jugador que ingrese un numero a su eleccion
    1.Piedra
    2.Papel
    3.Tijera

    El programa mostrara la eleccion de la computadora

    Las reglas
    Piedra vence Tijera
    Tijera vence Papel
    Papel vence Piedra

    Se debe determinar al ganador del juego
    El programa debe manejar entradas invalidas o numeros fuera del rango especificos
 */

fun main(){
    println("Por favor ingresa un numero del 1 al 3, donde \n1.Piedra \n2.Tijera \n3.Papel")
    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1..3

//    if(choiceInput != null && choiceInput in 1..3){
//        isValidInput = true
//    }

    //Cuando isValidInput es falso entra aqui
    while(!isValidInput){
        println("Entrada no valida.Por favor ingresa los numeros 1,2 o 3")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null && choiceInput in 1..3
    }

    //println("Juego se ejecuto")
    val computerChoice = (1..3).random()
    val computerChoiceString = when {
        computerChoice == 1 -> "Piedra"
        computerChoice == 2 -> "Tijera"
        computerChoice == 3 -> "Papel"
        else -> "Sin eleccion"
    }
    println("La computadora selecciono $computerChoiceString")

    val winner = when{
        choiceInput == computerChoice -> "Empate"
        choiceInput == 1 && computerChoice == 2 -> "El jugador"
        choiceInput == 2 && computerChoice == 3 -> "El jugador"
        choiceInput == 3 && computerChoice == 1 -> "El jugador"
        else -> "La computadora"
    }
    println("El ganador es: $winner")


}

