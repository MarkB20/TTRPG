package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Brawler : CoreClassTraits(
    name = "Brawler",
    hitDice = "1d10",
    proficiencies = listOf("Athletics", "Acrobatics"),
    savingThrows = listOf("Strength", "Dexterity"),
    features = listOf("Unarmed Combat", "Grappler's Advantage", "Counterstrike"),
    startingEquipment = listOf("Knuckle Dusters", "Explorer's Pack", "Rope")
)
