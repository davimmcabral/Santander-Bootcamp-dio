package testes

import Banco

fun main() {
    val digOneBank = Banco(nome = "Digone", numero = 12)
    println(digOneBank.nome)
    println(digOneBank.numero)

    val banco2 = digOneBank.copy(nome = "melbank")
    println(banco2.nome)
}