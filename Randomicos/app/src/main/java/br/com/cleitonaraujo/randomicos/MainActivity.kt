package br.com.cleitonaraujo.randomicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Style "Theme.AppCompat.Light.NoActionBar" esconde também a status bar e deixa transparente
        // O método abaixo certifica que a Action bar seja escondida
        //if (supportActionBar != null) {
        //    supportActionBar!!.hide()

        setListeners()
        }
    /**
     * Qualquer evento de click disparado aciona o método
     */
    override fun onClick(v: View?) {
         //Validação de qual elemento foi clicado
         if(v?.id == R.id.buttomRandom || v?.id == R.id.textNumber){
             textNumber.text = random().toString()
         }
     }
     private fun random(): Int {
        return Random().nextInt(50)
     }

    private fun setListeners() {
        buttomRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)
    }
}