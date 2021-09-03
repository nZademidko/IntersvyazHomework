interface CatGenerator {

    fun getTableOfCats(): String

    companion object {
        operator fun invoke(minCount: Int, maxCount: Int): CatGenerator = CatGeneratorImpl(minCount, maxCount)
    }
}