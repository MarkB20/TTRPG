package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Gadgeteer : CoreClassTraits(
    name = "Gadgeteer",
    hitDice = "1d8",
    proficiencies = listOf("Arcana", "Sleight of Hand"),
    savingThrows = listOf("Intelligence", "Dexterity"),
    features = listOf("Inventor's Toolkit", "Mechanical Expertise", "Quick Repairs"),
    startingEquipment = listOf("Tinker’s Tools", "Explorer's Pack", "Gadgets Assortment")
)