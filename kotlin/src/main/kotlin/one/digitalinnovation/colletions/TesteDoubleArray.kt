package one.digitalinnovation.colletions

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1020.0
    salarios[1] = 920.0
    salarios[2] = 4000.0

    salarios.forEach { println(it) }
    println("==============")
    salarios.forEachIndexed{index, salario -> salarios[index] = salario * 1.1}
    salarios.forEach { println(it) }
    println("==============")

    val salarios2 = doubleArrayOf(1500.00,1240.0,6000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}