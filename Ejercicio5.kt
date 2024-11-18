package While

//Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa por teclado). Mostrar la altura promedio de
//las personas.

fun main(parametro: Array<String>) {
    var personas = 0
    var suma = 0.0
    var contador = 1

    print("Ingrese el numero de personas: ")
    personas = readln().toInt()
    while (contador <= personas) {
        print("Altura de la persona $contador: ")
        val alturas = readln().toDouble()
        suma = suma + alturas
        contador = contador + 1
    }
    println("El promedio de altura de las $personas personitas es:")
    val promedio = suma / personas
    println("$promedio")
}
