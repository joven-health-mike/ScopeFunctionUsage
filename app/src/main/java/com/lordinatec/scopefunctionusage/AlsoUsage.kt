package com.lordinatec.scopefunctionusage

/**
 * Also Scope Function
 * https://kotlinlang.org/docs/scope-functions.html#function-selection
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/also.html
 *
 * Calls the specified function block with this value as its argument and returns this value.
 *
 * object == it (the object on which let is invoked)
 * return == this (the caller object)
 */

/**
 * Also can be used to initialize an object. The code within the also block guarantees that
 * "it" is initialized. The return value of the also block is the object itself.
 */
fun alsoInitializeObject() {
    val array = mutableListOf<Int>().also {
        it.add(1)
        it.add(2)
        it.add(3)
        // no need to return it
    }
    println(array.joinToString { it.toString() })
}