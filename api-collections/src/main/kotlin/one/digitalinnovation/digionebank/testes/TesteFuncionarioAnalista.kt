package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.FuncAnalista
import one.digitalinnovation.digionebank.Funcionario

fun main(){

    val funcAnalista = FuncAnalista(nome = "Carlos Funcionario Lima", cpf = "1234567", salario = 2000.0)
    println(funcAnalista.nome)
    println(funcAnalista.cpf)
    println(funcAnalista.salario)

    ImprimeFuncionario.imprime(funcAnalista)

}

