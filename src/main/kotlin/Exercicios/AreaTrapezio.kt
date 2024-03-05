package Exercicios

//Função para calcular a área do trapézio
fun areaTrazepio (baseMenor: Int, baseMaior: Int, altura: Int): Double{
    return ((baseMaior + baseMenor) * altura) / 2.0
}

fun main(args: Array<String>){
    // Calculando área do trapézio
    val baseMenorTrapezio = 6
    val baseMaiorTrapezio = 8
    val alturaTrapezio = 4
    val TrapezioArea = areaTrazepio(baseMenorTrapezio, baseMaiorTrapezio, alturaTrapezio)
    println("Área do trapézio: $TrapezioArea")
}