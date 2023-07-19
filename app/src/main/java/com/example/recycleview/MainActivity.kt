package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleview.databinding.ActivityMainBinding

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

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()

    }

    private fun initAdapter(){
        val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.RecycleList.adapter = adapter
    }
}