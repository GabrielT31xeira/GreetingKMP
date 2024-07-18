import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")
        add("Adivinha o que é isso na moral! > ${platform.name.reversed()}!")
        add(daysPhrasent())
    }
}