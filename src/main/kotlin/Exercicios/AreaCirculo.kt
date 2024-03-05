package Exercicios

//Função para calcular a área do circulo
fun areaCircunferencia (raio: Int): Double{
    return 3.14 * (raio * raio)
}

fun main(args: Array<String>){
    // Calculando área do círculo
    val raioCirculo = 3
    val CircunferenciaArea = areaCircunferencia(raioCirculo)
    println("Área da circunferência: $CircunferenciaArea")
}