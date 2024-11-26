package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Bard : CoreClassTraits(
    name = "Bard",
    hitDice = "1d8",
    proficiencies = listOf("Any"),
    savingThrows = listOf("Dexterity", "Charisma"),
    features = listOf("Bardic Inspiration", "Spellcasting", "Song of Rest"),
    startingEquipment = listOf("(a) a rapier, (b) a longsword, or (c) any simple weapon",
        "(a) a diplomat's pack or (b) an explorer's pack",
        "(a) a lute or (b) any other musical instrument",
        "Leather armor and a dagger")
)
