package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Barbarian : CoreClassTraits(
    name = "Barbarian",
    hitDice = "1d12",
    proficiencies = listOf("Athletics", "Intimidation"), // Example proficiencies
    savingThrows = listOf("Strength", "Constitution"),
    features = listOf("Rage", "Unarmored Defense"),
    startingEquipment = listOf("(a) a greataxe or (b) any martial melee weapon ", "(a) two handaxes or (b) any simple weapon", "An explorer's pack and four javelins")
) {
    val rageFeatures = listOf("Rage", "Unarmored Defense")
    val rageUsesPerLevel: Map<Int, Int> = mapOf(
        1 to 2,
        3 to 3,
        6 to 4,
        12 to 5
    )
}
