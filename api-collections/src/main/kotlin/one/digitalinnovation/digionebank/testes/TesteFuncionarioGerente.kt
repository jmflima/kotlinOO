package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.FuncGerente

fun main(){

    val gerente = FuncGerente(nome = "Carlos Gerente Lima", cpf = "1234567", salario = 4000.0, senha = "3538")
//    println(gerente.nome)
//    println(gerente.cpf)
//    println(gerente.salario)

    ImprimeFuncionario.imprime(gerente)

    TesteAutenticacao().autentica(gerente)

}

