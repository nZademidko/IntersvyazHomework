import java.lang.StringBuilder
import kotlin.random.Random

class CatGeneratorImpl(minCount: Int, maxCount: Int) : CatGenerator {

    private val cats = mutableListOf<Cat>()
    private val catColors = listOf("Белый", "Рыжий", "Красный", "Темный", "Темный")
    private val catType = listOf("Короткошерстный", "Анатолийский", "Аравийский", "Бенгальская", "Бомбейская")

    init {
        val count = Random.nextInt(minCount, maxCount)
        for (i in 0..count) {
            cats.add(
                    Cat(
                            color = catColors.random(),
                            type = catType.random(),
                            weight = Random.nextInt(1, 100),
                            alive = Random.nextBoolean()))
        }
    }

    private fun isAlive(isAlive: Boolean) = if (isAlive) "Да" else "Нет"


    override fun getTableOfCats(): String = StringBuilder().apply {
        append("Всего котЕков = ${cats.size}\n")
        cats.forEachIndexed { index, cat ->
            append("${index+1} котЕк | " +
                    "Цвет: ${cat.color} | " +
                    "Тип: ${cat.type} | " +
                    "Вес: ${cat.weight} | " +
                    "Живой ли?: ${isAlive(cat.alive)}\n")
        }
    }.toString()


}