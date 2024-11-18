package While

//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los
//sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de
//$300. Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.

fun main(parametro: Array<String>) {
    var empleados = 0
    var mayorescien = 0
    var mayorestrecientos = 0
    var contador = 1

    print("Ingrese el numero de epleados: ")
    empleados = readln().toInt()
    while (contador <= empleados) {
        print("Sueldo del empleado $contador: ")
        val sueldo = readln().toDouble()
        if (sueldo >= 100 && sueldo <= 300) {
            mayorescien++
        } else if(sueldo >= 300 && sueldo <= 500){
            mayorestrecientos++
        }

        contador++
    }

    println("Cantidad de sueldos mayores o iguales a 100: $mayorescien")
    println("Cantidad de sueldos mayores o iguales a 300: $mayorestrecientos")
}