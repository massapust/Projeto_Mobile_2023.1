package com.horadedoar.api.model

import com.google.gson.annotations.SerializedName

data class UsuarioModel(
    @SerializedName("email")
    var email: String,

    @SerializedName("senha_acesso")
    var senha_acesso: String
)
