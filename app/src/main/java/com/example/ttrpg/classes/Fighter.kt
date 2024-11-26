package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Fighter : CoreClassTraits(
    name = "Fighter",
    hitDice = "1d10",
    proficiencies = listOf("Athletics", "Intimidation"),
    savingThrows = listOf("Strength", "Constitution"),
    features = listOf("Second Wind", "Action Surge", "Fighting Style"),
    startingEquipment = listOf("Chain Mail", "Shield", "Longsword")
)
