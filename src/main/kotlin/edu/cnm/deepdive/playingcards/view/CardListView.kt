package edu.cnm.deepdive.playingcards.view

import edu.cnm.deepdive.playingcards.model.Card

object CardListView {

    @JvmStatic
    fun toString(cards: List<Card>): String = cards.joinToString(", ") { CardView.toString(it) }

}