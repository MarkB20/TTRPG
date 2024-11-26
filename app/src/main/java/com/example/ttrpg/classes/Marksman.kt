package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Marksman : CoreClassTraits(
    name = "Marksman",
    hitDice = "1d10",
    proficiencies = listOf("Perception", "Stealth"),
    savingThrows = listOf("Dexterity", "Wisdom"),
    features = listOf("Sharpshooter", "Trick Shots", "Deadly Precision"),
    startingEquipment = listOf("Longbow", "Arrows (20)", "Leather Armor")
)