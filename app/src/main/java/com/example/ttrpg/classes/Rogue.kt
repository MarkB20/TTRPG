package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Rogue : CoreClassTraits(
    name = "Rogue",
    hitDice = "1d8",
    proficiencies = listOf("Stealth", "Sleight of Hand"),
    savingThrows = listOf("Dexterity", "Intelligence"),
    features = listOf("Sneak Attack", "Evasion", "Cunning Action"),
    startingEquipment = listOf("Shortsword", "Thieves' Tools", "Leather Armor")
)