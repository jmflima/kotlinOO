package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val cliente = Cliente(
        nome = "Pedro Pires",
        cpf = "123654699999",
        clienteTipo= ClienteTipo.PF,
        senha = "1234558"
    )

    println(cliente)

    TesteAutenticacao().autentica(cliente)
}