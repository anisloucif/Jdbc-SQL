package org.example.model.entity

import java.time.LocalDate

class Note (
    val id: Int?,
    val note: Float,
    val typeEvaluation: String,
    val dateEvaluation: LocalDate,
    val etudiant: Etudiant,
    val matiere: Matiere
)
{

}