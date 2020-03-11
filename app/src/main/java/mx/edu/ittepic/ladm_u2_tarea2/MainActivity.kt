package mx.edu.ittepic.ladm_u2_tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var lienzo  : Lienzo ?= null
    var hilo = HiloControl(this)
    var x = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Hilos! Irving Díaz")
        lienzo = Lienzo(this)
        setContentView(lienzo!!)

        hilo.start()
    }
}
