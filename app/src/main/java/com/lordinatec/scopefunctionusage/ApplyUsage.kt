package com.lordinatec.scopefunctionusage

/**
 * Apply Scope Function
 * https://kotlinlang.org/docs/scope-functions.html#function-selection
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/apply.html
 *
 * Calls the specified function block with this value as its receiver and returns this value.
 *
 * object == this (the caller object)
 * return == this (the caller object)
 */

/**
 * Apply can be used to initialize an object. The code within the apply block guarantees that "it" is
 * initialized. The return value of the apply block is the object itself.
 */
fun applyInitializeObject() {
    val array = mutableListOf<Int>().apply {
        add(1) // no need to use it.add(1) because we're in the scope of the object
        add(2)
        add(3)
        // no need to return "this"
    }
    println(array.joinToString { it.toString() })
}