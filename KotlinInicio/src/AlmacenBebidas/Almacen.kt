package AlmacenBebidas

class Almacen {
    // Creamos una matriz de 5x5 que representa el almacén
    val almacen = Array(5) { arrayOfNulls<Bebida?>(5) }

    // Ejemplo de cómo agregar una bebida en una posición específica
    fun agregarBebida(fila: Int, columna: Int, bebida: Bebida): Boolean {
        if (fila in 0..4 && columna in 0..4 && almacen[fila][columna] == null) {
            almacen[fila][columna] = bebida
            return true
        }
        println("No se puede agregar la bebida en esa posición. Puede estar fuera de rango o ya ocupada.")
        return false
    }

    // Ejemplo de cómo quitar una bebida en una posición específica
    fun quitarBebida(fila: Int, columna: Int): Boolean {
        if (fila in 0..4 && columna in 0..4 && almacen[fila][columna] != null) {
            almacen[fila][columna] = null
            return true
        }
        println("No se encontró bebida en esa posición para quitar.")
        return false
    }

    // Función para mostrar el contenido del almacén
    fun mostrarAlmacen() {
        for (fila in almacen) {
            for (bebida in fila) {
                if (bebida != null) {
                    print("${bebida.id} | ")
                } else {
                    print("Vacío | ")
                }
            }
            println()  // Nueva línea para cada fila
        }
    }

}