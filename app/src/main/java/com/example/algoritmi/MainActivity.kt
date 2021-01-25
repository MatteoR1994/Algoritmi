package com.example.algoritmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var inputUtente: EditText
    lateinit var risultatoConteggio: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputUtente = findViewById(R.id.inputText)
        risultatoConteggio = findViewById(R.id.stringaRisultato)
    }

    fun calcMaxNoRep(v: View) {
        val input = inputUtente.text.toString()
        if (input == "") {
            risultatoConteggio.text = "Devi inserire una parola!!!"
        } else {
            risultatoConteggio.text = inputUtente.text.toString()
        }
    }
    fun findMaxUniqueSubstring(s: String): Int {
        // Se la stringa ha lunghezza < 2, ritorna lunghezza stringa.

        // - Crea variabile che tiene valore stringa + lunga, longest, da restituire alla fine.
        // - Per ogni carattere stringa:
        // 1) definire variabile lunghezza_corrente, inizialmente = 0
        // 2) creare una mappa di char e int (carattere e posizione carattere)
        //     - Altro ciclo for, su tutti i caratteri a dx di quello corrente (fino a fine stringa)
        //     1) Guardo carattere in questa posizione
        //     2) Se carattere non c'è nella mappa, { aumento di 1 lunghezza_corrente,
        //                                            inserisco nella mappa questo carattere e sua posizione,
        //                                            aggiorno longest con valore maggiore tra longest e lunghezza_corrente
        //                                          }
        //        Se carattere c'è nella mappa, interrompi ciclo interno
        // return longest
        return 0
    }
}