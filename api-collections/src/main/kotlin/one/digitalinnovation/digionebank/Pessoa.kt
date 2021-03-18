package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "João Lima"
    var cpf: String = "123.452.331-25"
}

fun main(){

    val joao = Pessoa()

    println(joao.nome)
    println(joao.cpf)
}