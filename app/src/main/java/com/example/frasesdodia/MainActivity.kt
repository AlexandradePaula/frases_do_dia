package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "Felicidade não é a crença de que não precisamos mudar, é a percepção de que podemos. Shawn Achor ",
        "Os homens são felizes em um meio ambiente no qual o comportamento ativo, produtivo e criativo é reforçado de forma efetiva. B.F. Skinner",
        "Cada pessoa é um abismo. Dá vertigem olhar dentro delas.",
        "Nenhum ser humano é capaz de esconder um segredo. Se a boca se cala, falam as pontas dos dedos."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase) as TextView
    }

    fun gerarFrase(view: View){

        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArray)

        texto.setText( frases [numeroAleatorio])






    }
}