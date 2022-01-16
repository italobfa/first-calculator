fun main() {

    do{
        println("Primeira calculadora")
        println("1 = Adição")
        println("2 = Subtração")
        println("3 = Multiplicação")
        println("4 = Divisão")
        println("5 = Fechar calculadora")
        println("Digite o número da operação que deseja realizar")

        val operador = readln().toInt()
        if(operador != 5){
            println("Digite o primeiro valor")
            val valor1 = readln().toInt()
            println("Digite o segundo valor")
            val valor2 = readln().toInt()

            fun soma(valor1: Int, valor2: Int): Int {
                return valor1 + valor2
            }

            fun subtrai(valor1: Int, valor2: Int): Int{
                return valor1-valor2
            }

            fun multiplica(valor1: Int, valor2: Int): Int{
                return valor1*valor2
            }

            fun divide(valor1: Int, valor2: Int): Int{
                return valor1/valor2
            }

            when (operador) {
                1 -> {
                    println("$valor1 + $valor2 = ${soma(valor1, valor2)}")
                }
                2 -> {
                    println("$valor1 - $valor2 = ${subtrai(valor1, valor2)}")
                }
                3 -> {
                    println("$valor1 * $valor2 = ${multiplica(valor1, valor2)}")
                }
                4 -> {
                    println("$valor1 / $valor2 = ${divide(valor1, valor2)}")
                }
                else -> return
            }
        }
    }while(operador != 5)
    println("Obrigado por usar nossa calculadora")
}