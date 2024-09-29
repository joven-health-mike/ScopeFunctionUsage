package com.lordinatec.scopefunctionusage

/**
 * Run Scope Function
 * https://kotlinlang.org/docs/scope-functions.html#function-selection
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/run.html
 *
 * Calls the specified function block with this value as its receiver and returns its result.
 *
 * object == this (as if code was running inside the object)
 * return == the result of the lambda expression
 */

/**
 * Run can be used to initialize an object. The code within the run block guarantees that "this" is
 * initialized. The return value of the run block is the result of the lambda expression.
 */
fun runInitializeObject() {
    val array = mutableListOf<Int>().run {
        add(1)
        add(2)
        add(3)
        this // must return "this" at the end
    }
    println(array.joinToString { it.toString() })
}