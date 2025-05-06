package org.example

fun calcularValores(a:Double, b:Double, c:Double):Unit{
    println("TABLA DE VALORES")
    println("x  |  y")
    for (x:Int in -5..5){
        var y:Double = a*x*x+b*x+c
        if (x<0){
            println("$x |  $y")
            continue
        }
        println("$x  |  $y")
    }
}
fun calcularRaices(a:Double, b:Double, c:Double):Unit{
    val dicriminante:Double = b*b-4.0*a*c //calculamos el discriminante

    when{
        dicriminante > 0.0 ->{
            println("La función tiene 2 raices reales")

            val raiz1 = (-b + Math.sqrt(dicriminante)/(2.0 * a)) //calculamos la raiz 1
            val raiz2 = (-b - Math.sqrt(dicriminante)/(2.0 * a)) //calculamos la raiz 2

            //Mostrar las raices con 2 decimales
            println("Raiz 1 = %.2f".format(raiz1))
            println("Raiz 2 = %.2f".format(raiz2))

        }
        dicriminante < 0.0 ->{
            println("La función no tiene raices")
        }
        else ->{
            println("La función tiene una raiz")
            val raiz: Double = -b/2*a

            println("Raiz = %.2f".format(raiz))
        }
    }
}

fun main() {
    //Definición de los coeficientes
    val a: Double = 1.0 //Co. Cuadratico
    val b: Double = 5.0 //Co. Lineal
    val c: Double = 6.0 //Ordenada al Origen

    // Validar que "a" no sea 0
    if (a == 0.0){
        println("El coeficiente cuadrático no puede ser 0")
    }

    //Mostrar la funcion en formato ax²+bx+c
    println("La función que tenemos es: f(x)=${a}x²+${b}x+${c}")

    //Mostrar tabla de valores.
    calcularValores(a,b,c)

    //Cálculo de raices
    calcularRaices(a,b,c)
}