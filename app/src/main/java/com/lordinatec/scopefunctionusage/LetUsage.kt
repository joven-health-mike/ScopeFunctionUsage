package com.lordinatec.scopefunctionusage

/**
 * Let Scope Function
 * https://kotlinlang.org/docs/scope-functions.html#function-selection
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/let.html
 *
 * Calls the specified function block with this value as its argument and returns its result.
 *
 * object == it (the object on which let is invoked)
 * return == the result of the lambda expression
 */

/**
 * Let can be used to check if an object is null. The code within the let block guarantees that
 * "it" is not null. It can be combined with the elvis operator and run function to handle the
 * null case.
 */
fun letNullCheck(str: String?) {
    str?.let {
        println("str is not null")
    } ?: run { println("str is null") }
}

/**
 * Let can be used to initialize an object. The code within the let block guarantees that "it" is
 * initialized. The return value of the let block is the new value of "it".
 */
fun letInitializeObject() {
    val array = mutableListOf<Int>().let {
        it.add(1)
        it.add(2)
        it.add(3)
        it // must return "it" at the end
    }
    println(array.joinToString { it.toString() })
}

