package com.example.horadedoar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.horadedoar.api.model.DoadorModel
import com.horadedoar.api.service.DoadorService
import java.text.SimpleDateFormat
import java.util.*

class cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val buttonClick = findViewById<Button>(R.id.btnCadastrar)
        buttonClick.setOnClickListener {
            inserirDoador();
        }

        val formatter = SimpleDateFormat("dd/MM/yyyy")

        var model = DoadorModel(
            nome_completo = "Luiza Nery",
            telefone = "11986481416",
            email = "luiza@luiza.com.br",
            tipo_sanguineo = "B+",
            data_nascimento = formatter.parse("04/02/1981")
        )

        var service = DoadorService()

        var retorno = service.incluirDoador(model)

        if(retorno != null){
            if(retorno?.value?.isError == false){
                Toast.makeText(getApplicationContext(),"Cadastrado com sucesso!",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(),"Erro ao cadastrar o doador!",Toast.LENGTH_LONG).show();
            }
        }
    }

    fun inserirDoador() {
        var nomeCompleto = findViewById<EditText>(R.id.txtNomeCompleto)
        var dataNascimento = findViewById<EditText>(R.id.txtDataNascimento)
        var telefone = findViewById<EditText>(R.id.txtTelefone)
        var tipoSanguineo = findViewById<EditText>(R.id.txtTipoSanguineo)
        var email = findViewById<EditText>(R.id.txtEmail)
        var confirmaEmail = findViewById<EditText>(R.id.txtConfimarEmail)
        var senha = findViewById<EditText>(R.id.txtSenha)
        var confirmaSenha = findViewById<EditText>(R.id.txtConfirmaSenha)

        val formatter = SimpleDateFormat("dd/MM/yyyy")

        var model = DoadorModel(
            nome_completo = nomeCompleto.text.toString(),
            telefone = telefone.text.toString(),
            email = email.text.toString(),
            tipo_sanguineo = tipoSanguineo.text.toString(),
            data_nascimento = formatter.parse(dataNascimento.text.toString())
        )

        var service = DoadorService()

        var retorno = service.incluirDoador(model)

        if(retorno != null){
            if(retorno?.value?.isError == false){
                Toast.makeText(getApplicationContext(),"Cadastrado com sucesso!",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(),"Erro ao cadastrar o doador!",Toast.LENGTH_LONG).show();
            }
        }
    }
}