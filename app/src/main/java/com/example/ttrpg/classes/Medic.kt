package com.example.ttrpg.classes

import com.example.ttrpg.CoreClassTraits

class Medic : CoreClassTraits(
    name = "Medic",
    hitDice = "1d8",
    proficiencies = listOf("Medicine", "Insight"),
    savingThrows = listOf("Wisdom", "Intelligence"),
    features = listOf("Healing Hands", "Triage Expertise", "Emergency Aid"),
    startingEquipment = listOf("Healer's Kit", "Explorer's Pack", "Surgical Tools")
)