package one.digitalinnovation.colletions

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 4
    values[2] = 7
    values[3] = 6
    values[4] = 8

   // for (valor in values){ println(valor)}

    //values.forEach { println(it) }

    //values.forEach { valor -> println(valor) }

    //for (index in values.indices){ println(values[index])}

    values.sort()
    for (valor in values){ println(valor)}
}