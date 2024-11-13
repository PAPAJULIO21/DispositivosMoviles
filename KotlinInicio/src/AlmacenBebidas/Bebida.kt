package AlmacenBebidas

import java.util.Scanner

class Bebida(val id: Int, val litros: Double, var precio: Double, val marca: String){

    override fun toString(): String {
        return "Bebida(id=$id, litros=$litros, precio=$precio, marca='$marca')"
    }
}

