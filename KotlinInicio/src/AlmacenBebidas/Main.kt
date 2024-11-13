package AlmacenBebidas

import java.util.Scanner

fun  main(){
    var sc = Scanner(System.`in`)
    println("----------------------")
    println("Que Quieres Hacer")
    println("----------------------")
    println("1- Añadir Bebida")
    println("----------------------")
    var p = sc.nextInt()
    println("----------------------")

    when(p) {
        1 -> añadirBebida()
        else -> println("No vale este digito")
    }

}

fun añadirBebida(){
    var sc = Scanner(System.`in`)
    println("----------------------")
    println("Que bebida quieres añadir")
    println("----------------------")
    println("1- Agua Mineral \n" +
            "2- Bebida Azucarada")
    println("----------------------")
    var opcion = sc.nextInt()
    println("----------------------")

    when(opcion){
        1 -> {
            println("Tienes que darme los siguientes datos: ")
            println("----------------------")

        }
    }

}