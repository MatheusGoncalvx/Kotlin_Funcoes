package Exercicios

//Função para calcular a área do losango
fun areaLosango(ladoMaior: Int, ladoMenor: Int): Double{
    return (ladoMenor * ladoMaior) / 2.0
}

fun main(args: Array<String>){
    // Calculando área do losango
    val ladoMaiorLosango = 8
    val ladoMenorLosango = 6
    val LosangoArea = areaLosango(ladoMaiorLosango, ladoMenorLosango)
    println("Área do losango: $LosangoArea")
}