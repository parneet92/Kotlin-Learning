package bootiful.kotlin

//https://www.baeldung.com/java-super-type-tokens
//Super type tokens for generics in java
//this is what used a lot in extension functions
//kotlin implementation

//it acts like a macro and compiler just copy function definition
// , there's no actual method invocation
inline fun <reified T> handle(): String{
    return T::class.java.name
}

fun main(){
    //this what compiler converts whenever the handle is called
    //val type = String::class.java , T becomes the type wherever handle is called
    println(handle<String>())
    println(handle<Int>())
}