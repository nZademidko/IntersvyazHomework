import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    print("Введите минимальное количество котиков: ")
    val minCount = scanner.nextInt()
    print("Введите максимальное количество котиков: ")
    val maxCount = scanner.nextInt()
    val cat = CatGenerator(minCount = minCount, maxCount = maxCount)
    print(cat.getTableOfCats())

}