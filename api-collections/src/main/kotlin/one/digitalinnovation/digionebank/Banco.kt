package one.digitalinnovation.digionebank

data class Banco(
    val nome: String,
    val num: Int
){
    fun info() = "$nome - $num"
}
