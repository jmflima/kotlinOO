package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}