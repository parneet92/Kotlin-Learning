package bootiful.kotlin

// Extension Function
fun String.parneetTransform(
    transformer: (String) -> String = {str -> str.toUpperCase()}
): String {
    return transformer(this)
}

fun main(){

    println("Parneet".parneetTransform())
    println("Parneet".parneetTransform(){str -> str.reversed()})

    fun transform(
        str: String,
        transformer: (String) -> String = { str -> str.toUpperCase()}
    ): String {
        return transformer(str)
    }

    println(transform("Josh"))
    println(transform("Josh"){str -> str.reversed()})
}

//check out MyBatis