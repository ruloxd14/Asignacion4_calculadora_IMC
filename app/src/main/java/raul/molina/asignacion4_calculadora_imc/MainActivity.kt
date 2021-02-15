package raul.molina.asignacion4_calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Variables
    val peso = 0
    val altura = 0
    val imc = 0
    val calIMC: Button = findViewById(R.id.btnCalcular) as Button
    val Escpeso: EditText = findViewById(R.id.etPeso) as EditText
    val Escestatura: EditText = findViewById(R.id.etEstatura) as EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //evento button click
        calIMC.setOnClickListener(){
            calcularIMC()
            calIMC.setText(imc)
        }

    }

    //funcion
    fun calcularIMC() {
        var pesoR: Float = Escpeso.text.toString().toFloat()
        var estaturaR: Float = Escestatura.text.toString().toFloat()
        var imc: Float = pesoR*(estaturaR*estaturaR)
     }

}
