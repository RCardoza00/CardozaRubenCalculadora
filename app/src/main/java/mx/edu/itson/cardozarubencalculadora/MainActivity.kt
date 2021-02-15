package mx.edu.itson.cardozarubencalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uno : Button = findViewById(R.id.btn1) as Button
        val dos : Button = findViewById(R.id.btn2) as Button
        val tres : Button = findViewById(R.id.btn3) as Button
        val cuatro : Button = findViewById(R.id.btn4) as Button
        val cinco : Button = findViewById(R.id.btn5) as Button
        val seis : Button = findViewById(R.id.btn6) as Button
        val siete : Button = findViewById(R.id.btn7) as Button
        val ocho : Button = findViewById(R.id.btn8) as Button
        val nueve : Button = findViewById(R.id.btn9) as Button
        val cero : Button = findViewById(R.id.bton0) as Button
        val input : TextView = findViewById(R.id.tvCalc) as TextView
        val calc: TextView= findViewById(R.id.tvResult) as TextView
        val suma: Button= findViewById(R.id.btnSumar) as Button
        val dividir: Button= findViewById(R.id.btnDividir) as Button
        val restar: Button= findViewById(R.id.btnRestar) as Button
        val multiplicar: Button= findViewById(R.id.btnMultiplicar) as Button
        val resultado: Button= findViewById(R.id.btnResult) as Button
        val borrar: Button= findViewById(R.id.btnBorrar) as Button
        var operacion: String
        var num1:String =""
        var num2:String =""
        var res:Float =0.0f
        var delimiter = ""

        uno.setOnClickListener(){
        val process=input.text.toString()
            input.setText(process+"1")
        }
        dos.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"2")
        }
        tres.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"3")
        }
        cuatro.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"4")
        }
        cinco.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"5")
        }
        seis.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"6")
        }
        siete.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"7")
        }
        ocho.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"8")
        }
        nueve.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"9")
        }
        cero.setOnClickListener(){
            val process=input.text.toString()
            input.setText(process+"0")
        }
        suma.setOnClickListener(){

            val process=input.text.toString()
            delimiter = "+"

            input.setText(process+"+")

        }
        restar.setOnClickListener(){

            val process=input.text.toString()
            delimiter = "-"

            input.setText(process+"-")

        }
        dividir.setOnClickListener(){

            val process=input.text.toString()
            delimiter = "/"

            input.setText(process+"/")

        }
        multiplicar.setOnClickListener(){

            val process=input.text.toString()
            delimiter = "*"

            input.setText(process+"*")

        }
        borrar.setOnClickListener(){

            val process=input.text.toString()
            delimiter = ""

            input.setText("")
            calc.setText("")

        }
        resultado.setOnClickListener(){

            val process=input.text.toString()
            var str = process
            var operacion=""
            val parts = str.split(delimiter,ignoreCase = true)
            when(delimiter){
                "+" -> res=parts[0].toFloat() + parts[1].toFloat()
                "-" -> res=parts[0].toFloat() - parts[1].toFloat()
                "/" -> res=parts[0].toFloat() / parts[1].toFloat()
                "*" -> res=parts[0].toFloat() * parts[1].toFloat()
            }
            calc.setText(res.toString())

        }

    }
}


