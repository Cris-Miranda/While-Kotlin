package While

//Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales
//a 7 y cuántos menores.

fun main() {
    val totalNotas = 10 // Número total de notas a procesar
    var mayoresIguales7 = 0
    var menores7 = 0
    var contador = 1

    println("Ingrese las notas de $totalNotas alumnos:")

    while (contador <= totalNotas) {
        print("Nota del alumno $contador: ")
        val nota = readln().toDouble()

        if (nota >= 7) {
            mayoresIguales7++
        } else {
            menores7++
        }

        contador++
    }

    println("Cantidad de notas mayores o iguales a 7: $mayoresIguales7")
    println("Cantidad de notas menores a 7: $menores7")
}