package one.digitalinnovation.colletions

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Carla"

    for (nome in nomes){println(nome)}
    println("=============")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria","Carla","Jaja")
    println("=============")
    nomes2.sort()
    nomes2.forEach { println(it) }
}