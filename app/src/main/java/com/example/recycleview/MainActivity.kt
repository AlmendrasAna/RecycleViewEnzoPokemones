package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* Pasos para crear un Recycler View
* [x] Item Layout
*      ()Agregar Constraints
*      ()Definir ID
*      ()Cambiar altura Constraints layout a wrap_content
* [ ] Layout con recycler view
* [ ] Asignar Layout manager
* [ ] Adapter + view holder
* [ ] Obtener los datos
* [ ]
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}