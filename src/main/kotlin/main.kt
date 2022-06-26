import java.lang.NumberFormatException
import kotlin.random.Random

/**
 * Main entry point of a project
 */
fun main() {

    val data = try {
        "a"
        throw NumberFormatException()
    } catch (e: Exception) {
        "b"
    } finally {
        "c"
    }
    if (data == "b") {
        val a = 1
    }

    val num = Random.nextInt(1, 101)
    loop@ while (true) {
        val guess = readLine()!!.toInt()

        val message = when {
            guess < num -> "Too Small"
            guess > num -> "Too Large"
            else -> break@loop
        }
        println(message)
    }
    print("Done")

}
