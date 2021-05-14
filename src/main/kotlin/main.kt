import kotlin.random.Random
import java.util.*
import java.util.Arrays.toString as toString1

fun main(args: Array<String>) {
    for (tablamultiplicar in Ejer1(10).array) {
        println(tablamultiplicar)

    val array = Ejer2(10){Random.nextInt(50, 250)}
        array.array.forEach { println(it) }
    }

}