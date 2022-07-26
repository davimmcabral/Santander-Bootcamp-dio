class Pessoa {
    var nome: String = "Davi"
    var cpf: String = "123.123.123.12"
    private set

    constructor()

    fun uniNomeeCPF() = "$nome + $cpf"

    //inner class Endereco{
    //    var rua: String = "Rua Teste"
    //}
}

fun main(){
    val davi = Pessoa()
  //  println(davi.nome)
  //  println(davi.cpf)
  //  println(davi.Endereco().rua)
        println(davi.uniNomeeCPF())
}