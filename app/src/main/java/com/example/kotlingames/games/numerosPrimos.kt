package com.example.kotlingames.games

fun main(){
    var esPrimo = false

    while(esPrimo == false) {
        println("Por favor ingresa un numero")
        var numberInput = readlnOrNull()?.toIntOrNull()

        if (numberInput != null) {
            if (numberInput <= 1) {
                esPrimo = false
            } else {
                esPrimo = true
                var i = 2
                while (i <= numberInput / 2) {
                    if (numberInput % i == 0) {
                        esPrimo = false
                        break
                    }
                    i++
                }
            }
        } else {
            println("Ingrese un numero valido")
        }

        if (esPrimo) {
            println("El numero $numberInput es primo")
        } else {
            println("El numero $numberInput no es primo")
        }
    }
}