package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {

    val varBank1 = Banco(nome= "Banco do Joao", num= 12)
    println(varBank1.nome)
    println(varBank1.num)

    println("*** Criando uma imagem com o comando Copy e assim alterando os atributos da Data Class")

    val varBank2 = varBank1.copy(nome="Outro Banco")
    println(varBank2.nome)
    println(varBank2.num)

    println("*** Outra forma de apresentação ***")
    println(varBank2.info())

}


