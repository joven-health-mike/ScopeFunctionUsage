package com.lordinatec.scopefunctionusage

/**
 * With Scope Function
 * https://kotlinlang.org/docs/scope-functions.html#function-selection
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/with.html
 *
 * Calls the specified function block with the given receiver as its receiver and returns its result.
 *
 * object == this (as if code was running inside the object)
 * return == the result of the lambda expression
 */

/**
 * With can be used to initialize an object. The code within the with block guarantees that "it" is
 * initialized. The return value of the with block is the result of the lambda expression.
 */
fun withInitializeObject() {
    val array = mutableListOf<Int>()
    val result = with(array) {
        add(1)
        add(2)
        add(3)
        true
    }
    println("result: $result: " + array.joinToString { it.toString() })
}