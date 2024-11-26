package com.example.ttrpg

// Core class traits shared by all classes
open class CoreClassTraits(
    val name: String, // Name of the class
    val hitDice: String, // Hit dice (e.g., "1d12")
    val proficiencies: List<String>, // Skills, tools, or other proficiencies
    val savingThrows: List<String>, // Saving throws the class is proficient in
    val features: List<String>, // Core class features
    val startingEquipment: List<String> // Starting equipment
) {
    open fun displayClassInfo() {
        println("Class: $name")
        println("Hit Dice: $hitDice")
        println("Proficiencies: $proficiencies")
        println("Saving Throws: $savingThrows")
        println("Features: $features")
    }
}
