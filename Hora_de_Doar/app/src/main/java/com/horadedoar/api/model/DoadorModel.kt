package com.horadedoar.api.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class DoadorModel(
    @SerializedName("nome_completo")
    var nome_completo: String,

    @SerializedName("data_nascimento")
    var data_nascimento: Date,

    @SerializedName("telefone")
    var telefone: String,

    @SerializedName("email")
    var email: String,

    @SerializedName("tipo_sanguineo")
    var tipo_sanguineo: String
)
