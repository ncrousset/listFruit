package com.example.listfruit.data

import com.example.listfruit.R
import com.example.listfruit.model.Fruit

class Datasource {

    fun loadFruits() : List<Fruit> {
        return listOf<Fruit>(
            Fruit(R.string.orange, R.drawable.orange),
            Fruit(R.string.grapes, R.drawable.grapes),
            Fruit(R.string.lime, R.drawable.lime),
            Fruit(R.string.lemon, R.drawable.lemon),
            Fruit(R.string.blueberry, R.drawable.blueberry),
            Fruit(R.string.banana, R.drawable.banana),
            Fruit(R.string.apple, R.drawable.apple),
            Fruit(R.string.watermelon, R.drawable.watermelon),
            Fruit(R.string.peach, R.drawable.peach),
            Fruit(R.string.pineapple, R.drawable.pineapple),
            Fruit(R.string.strawberry, R.drawable.strawberry),
            Fruit(R.string.cherry, R.drawable.cherry),
            Fruit(R.string.coconut, R.drawable.coconut),
            Fruit(R.string.pear, R.drawable.pear),
            Fruit(R.string.apricot, R.drawable.apricot),
            Fruit(R.string.avocado, R.drawable.avocado),
            Fruit(R.string.blackberry, R.drawable.blackberry),
            Fruit(R.string.grapefruit, R.drawable.grapefruit),
            Fruit(R.string.mango, R.drawable.mango),
            Fruit(R.string.plum, R.drawable.plum),
            Fruit(R.string.raspberry, R.drawable.raspberry),
            Fruit(R.string.pomegranate, R.drawable.pomegranate),
            Fruit(R.string.fig, R.drawable.fig),
            Fruit(R.string.passion_fruit, R.drawable.passion_fruit),
            Fruit(R.string.tangerine, R.drawable.tangerine),
            Fruit(R.string.papaya, R.drawable.papaya),
        )
    }
}