package one.digitalinnovation.digionebank

class FuncAnalista(nome: String,
                   cpf: String,
                   salario: Double
): Funcionario(nome, cpf, salario) {
    override fun CalculoAuxilio() = salario * 0.1
}