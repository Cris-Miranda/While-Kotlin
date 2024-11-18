package While

fun main(parametro: Array<String>) {
    print("Ingrese un valor:")
    val valor = readln().toInt()
    var x = 1
    while (x <= valor) {
        println(x)
        x = x + 1
    }
}