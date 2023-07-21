package com.example.recycleview

import androidx.core.graphics.toColorInt

class Color2() {
    companion object {
        fun listColor(): List<DataClassColores> {
            var colores = mutableListOf<DataClassColores>()

            colores.add(DataClassColores("Steel", "#FFD3D3D3".toColorInt()))
            colores.add(DataClassColores("Water", "#FF4169E1".toColorInt()))
            colores.add(DataClassColores("Bug", "#FF9ACD32".toColorInt()))
            colores.add(DataClassColores("Dragon", "#FF7B68EE".toColorInt()))
            colores.add(DataClassColores("Electric", "#FFFFFF00".toColorInt()))
            colores.add(DataClassColores("Ghost", "#FF800080".toColorInt()))
            colores.add(DataClassColores("Fire", "#FFDC143C".toColorInt()))
            colores.add(DataClassColores("Fairy", "#FFFF88EE".toColorInt()))
            colores.add(DataClassColores("Ice", "#FF7FFFD4".toColorInt()))
            colores.add(DataClassColores("Fighting", "#FFB22222".toColorInt()))
            colores.add(DataClassColores("Normal", "#FFE6E6FA".toColorInt()))
            colores.add(DataClassColores("Grass", "#FF00FF00".toColorInt()))
            colores.add(DataClassColores("Psychic", "#FFEE82EE".toColorInt()))
            colores.add(DataClassColores("Rock", "#FFCD853F".toColorInt()))
            colores.add(DataClassColores("Dark", "#FF708090".toColorInt()))
            colores.add(DataClassColores("Ground", "#FFDEB887".toColorInt()))
            colores.add(DataClassColores("Poison", "#FF9370DB".toColorInt()))

            return colores
        }
    }
}