package one.digitalinnovation.digionebank

class FuncGerente(nome: String,
                  cpf: String,
                  salario: Double,
                  val senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun CalculoAuxilio() = salario * 0.4

    override fun Login(): Boolean = "3535" == senha
}