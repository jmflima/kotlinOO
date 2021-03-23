package one.digitalinnovation.digionebank

class FuncGerente(nome: String,
                  cpf: String,
                  salario: Double
): Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun CalculoAuxilio() = salario * 0.4
}