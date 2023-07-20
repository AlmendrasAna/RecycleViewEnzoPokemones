package com.example.recycleview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
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

        /*
        private fun ColorPorTipo(type: String) {
            when (type) {
                "Water" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.water_background))
                "Fire" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.fire_background))
                "Bug" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.bug_background))
                "Grass" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.grass_background))
                "Normal" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.normal_background))
                "Steel" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.steel_background))
                "Dragon" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.dragon_background))
                "Electric" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.electric_background))
                "Ghost" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.ghost_background))
                "Fairy" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.fairy_background))
                "Ice" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.ice_background))
                "Fighting" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.fighting_background))
                "Psychic" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.psychic_background))

                else -> binding.CardPokemones.setCardBackgroundColor(Color.WHITE) // Color predeterminado si no coincide con ninguna opción.
            }
        }
        */
        private fun ColorPorTipo(type: String) {
            when  {
                type.startsWith("water", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.water_background))
                type.startsWith("fire", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.fire_background))
                type.startsWith("bug", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.bug_background))
                type.startsWith("grass", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.grass_background))
                type.startsWith("steel", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.steel_background))
                type.startsWith("dragon", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.dragon_background))
                type.startsWith("normal", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.normal_background))
                type.startsWith("electric", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.electric_background))
                type.startsWith("ghost", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.ghost_background))
                type.startsWith("fairy", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.fairy_background))
                type.startsWith("ice", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.ice_background))
                type.startsWith("fighting", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.fighting_background))
                type.startsWith("psychic", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.psychic_background))
                type.startsWith("rock", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.rock_background))
                type.startsWith("dark", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.dark_background))
                type.startsWith("ground", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.ground_background))
                type.startsWith("poison", ignoreCase = true) -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.poison_background))
                else -> binding.CardPokemones.setCardBackgroundColor(Color.WHITE) // Color predeterminado si no coincide con ninguna opción.
            }
        }
    }


}