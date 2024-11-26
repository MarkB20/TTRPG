package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Savant : CoreClassTraits(
    name = "Savant",
    hitDice = "1d6",
    proficiencies = listOf("Arcana", "History"),
    savingThrows = listOf("Intelligence", "Wisdom"),
    features = listOf("Keen Mind", "Quick Study", "Arcane Analysis"),
    startingEquipment = listOf("Spellbook", "Component Pouch", "Scholar’s Pack")
)