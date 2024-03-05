package Exercicios

//Importando método que calcula raiz quadrada
import kotlin.math.sqrt

//Função para calcular a área do retangulo
fun areaRetangulo (base: Int, largura: Int ): Int{
    return base * largura
}

fun main (args: Array<String>) {

    //Calculando área do retangulo
    val baseRetangulo = 5
    val alturaRetangulo = 3
    val RetanguloArea = areaRetangulo(baseRetangulo, alturaRetangulo)
    println("Área do retangulo é $RetanguloArea")
}