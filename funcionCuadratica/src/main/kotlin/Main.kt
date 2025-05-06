package org.example

fun calcularValores(a:Int, b:Int, c:Int):Unit{
    println("TABLA DE VALORES")
    println("x | y")
    for (x:Int in -5..5){
        var y:Int = a*x*x+b*x+c
        println("$x | $y")
    }
}

fun main() {
    //Definición de los coeficientes
    val a: Int = 5 //Co. Cuadratico
    val b: Int = 2 //Co. Lineal
    val c: Int = 6 //Ordenada al Origen

    // Validar que "a" no sea 0
    if (a == 0){
        println("El coeficiente cuadrático no puede ser 0")
    }

    //Mostrar la funcion en formato ax²+bx+c
    println("La función que tenemos es: f(x)=${a}x²+${b}x+${c}")

    //Mostrar tabla de valores
    calcularValores(a,b,c)


}