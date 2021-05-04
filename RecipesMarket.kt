fun main(){
    println("::: Bienvenido a Recipe Market :::")
    do {
        println(
            "Selecciona la opción deseada\n" +
                    "1. Hacer una receta\n" +
                    "2. Ver mis recetas\n" +
                    "3. Salir"
        )
        val valor: Int = readLine()?.toInt() ?: 4
        when(valor){
            1 -> hacerReceta()
            2 -> verMisREcetas()
            3 -> println("Hasta Luego")
            else -> println("opcion incorrecta")
        }
    }while (valor!=3)
    }
