package Exercicios

import kotlin.math.sqrt

//Função para calcular a área do triângulo equilatero
fun areaTrianguloEquilatero (lado: Int): Double{
    return ((lado * lado) * sqrt(3.0)) / 4
}

//Função para calcular a área do triângulo isóceles
fun areaTrianguloIsosceles (lado: Int, base: Int): Double {
    val altura = sqrt((lado * lado) - ((base * base) / 4.0))
    return (base * altura) / 2
}

//Função para calcular a área do triângulo escaleno
fun areaTrianguloEscaleno (lado1: Int, lado2: Int, lado3: Int): Double{
    val semiPerimetro = (lado1 + lado2 + lado3) / 2.0
    return sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3))
}

fun main(args: Array<String>){
    // Calculando área do triângulo equilátero
    val ladoTrianguloEquilatero = 5
    val TrianguloEquilateroArea = areaTrianguloEquilatero(ladoTrianguloEquilatero)
    println("Área do triângulo equilátero: $TrianguloEquilateroArea")

    // Calculando área do triângulo isósceles
    val ladoTrianguloIsosceles = 5
    val baseTrianguloIsosceles = 4
    val TrianguloIsoscelesArea = areaTrianguloIsosceles(ladoTrianguloIsosceles, baseTrianguloIsosceles)
    println("Área do triângulo isósceles: $TrianguloIsoscelesArea")

    // Calculando área do triângulo escaleno
    val lado1 = 3
    val lado2 = 4
    val lado3 = 5
    val TrianguloEscalenoArea = areaTrianguloEscaleno(lado1, lado2, lado3)
    println("Área do triângulo escaleno: $TrianguloEscalenoArea")
}