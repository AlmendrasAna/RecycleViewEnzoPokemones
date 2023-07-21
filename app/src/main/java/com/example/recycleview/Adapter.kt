package com.example.recycleview


import android.graphics.drawable.GradientDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.recycleview.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

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
            binding.txtId.text = pokemon.id
            Log.e("loll", "dfas")
            binding.CardPokemones.background = ColorPorTipo(pokemon.tipo)
            Log.e("loll", "das")
        }

        /*
        private fun ColorPorTipo(type: String) {
            val gradientDrawable = GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null)
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
                "Rock" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.rock_background))
                "Ground" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.ground_background))
                "Dark" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.dark_background))
                "Poison" -> binding.CardPokemones.setCardBackgroundColor(ContextCompat.getColor(this.itemView.context,R.color.poison_background))

                else -> binding.CardPokemones.setCardBackgroundColor(Color.WHITE) // Color predeterminado si no coincide con ninguna opción.
            }
        }

        */


        fun ColorPorTipo(type: String): GradientDrawable {
            var colorInt1 = "#FFB22222".toColorInt()
            var colorInt2 = "#FFEFE1D1".toColorInt()
            var colores = mutableListOf<DataClassColores>()
            colores = Color2.listColor().toMutableList()
            Log.e("loll", type)


            if (type.indexOf("-") != -1) {
                val color2 = type.substring(type.indexOf("-")+2, type.length)
                val color1 = type.substring(0, type.indexOf("-")-1)

                for (c in colores) {

                    if (color1.equals(c.nombreColor)) {
                        colorInt1 = c.colorLong
                    }

                    if (color2.equals(c.nombreColor)) {
                        colorInt2 = c.colorLong
                    }
                }
            } else {
                for (c in colores) {

                    if (type.equals(c.nombreColor)) {
                        colorInt1 = c.colorLong
                        colorInt2 = c.colorLong
                    }
                }
            }


            var gfgGradient = GradientDrawable(
                GradientDrawable.Orientation.LEFT_RIGHT, intArrayOf(colorInt1, colorInt2)
            )


            return gfgGradient
        }


    }
}











