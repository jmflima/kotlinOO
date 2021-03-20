package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    println("**** Outra forma para apresentar os dados do Enum *****")
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    println("**** Mais uma forma para apresentar os dados do Enum *****")
    val pfisica = ClienteTipo.PF
    println("${pfisica.name} - ${pfisica.descricao}")
    val pjuridica = ClienteTipo.PF
    println("${pjuridica.name} - ${pjuridica.descricao}")
}
