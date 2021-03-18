package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "João Lima"
    var cpf: String = "123.452.331-25"
    var numero: Int = 60

    private set //impede a alteração

//    inner class Endereco {
//        var rua: String = "Rua Manoel Arruda Cavalcanti"
//    }

    constructor()

    fun pessoaInfo1() = "$nome e $cpf"
    fun pessoaInfo2() = println(nome + " mais " + cpf + " - " + numero)
}

fun main(){

    val joao = Pessoa()

    println(joao.nome)
    println(joao.cpf)

    println(joao.pessoaInfo1())
    joao.pessoaInfo2()
}