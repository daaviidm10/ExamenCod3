class Ejer3 {
    val listaImpares = { array: Array<Int> ->
        array.filter {
            it % 2 != 0
        }.forEach(){
            println(it)
        }
    }
}