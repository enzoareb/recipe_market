val listaReceta:ArrayList<String> = ArrayList()
fun hacerReceta(){
    val listaIngredientes:HashMap<Int,String> = HashMap()
        listaIngredientes.set(0,"Volver Al Menu Principal")
        listaIngredientes.set(1,"Agua")
        listaIngredientes.set(2,"Leche")
        listaIngredientes.set(3,"Carne")
        listaIngredientes.set(4,"Verduras")
        listaIngredientes.set(5,"Frutas")
        listaIngredientes.set(6,"Cereal")
        listaIngredientes.set(7,"Huevos")
        listaIngredientes.set(8,"Aceite")
    println(":::::::::::::::::::::Hacer receta::::::::::::::::::::::::::::::::::")
    do {
        println(":: Lista de Ingredientes ::")
        listaIngredientes.forEach(){
            println("${it.key} ${it.value}")
        }
        println("ingese el numero correspondiente de la opcion elegida")
        val valor: Int = readLine()?.toInt() ?: 0
        if (valor<=8 && valor>=1){
            if (listaReceta.contains(listaIngredientes.getValue(valor))){
                println("el elemento ya esta en la lista")
            }else {
                println("Ingrediente Ingresado")
                listaReceta.add(listaIngredientes.getValue(valor))
            }
        }else{
            println("valor ingresado incorrecto")
        }
    }while (valor!=0)

}