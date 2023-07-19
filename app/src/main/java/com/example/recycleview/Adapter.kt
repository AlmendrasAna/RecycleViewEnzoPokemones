package com.example.recycleview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.recycleview.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter <Adapter.ViewHolder>() {

    var pokemones = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    fun setData(pokedex: List<Pokemon>) {
        this.pokemones = pokedex.toMutableList()
    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
            binding.txtNombre.text = pokemon.nombre
            binding.txtTipo.text = pokemon.tipo
            binding.imageView.load(pokemon.imgUrl)
            ColorPorTipo(pokemon.tipo)
        }

        private fun ColorPorTipo(type: String) {
            when (type) {
                "Water" -> binding.CardPokemones.setCardBackgroundColor(Color.BLUE)
                "Fire" -> binding.CardPokemones.setCardBackgroundColor(Color.RED)
                "Bug" -> binding.CardPokemones.setCardBackgroundColor(Color.GREEN)
                "Grass" -> binding.CardPokemones.setCardBackgroundColor(Color.GREEN)
                "Normal" -> binding.CardPokemones.setCardBackgroundColor(Color.GRAY)
                else -> binding.CardPokemones.setCardBackgroundColor(Color.WHITE) // Color predeterminado si no coincide con ninguna opción.
            }
        }
    }


}