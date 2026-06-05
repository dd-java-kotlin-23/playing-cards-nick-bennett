package edu.cnm.deepdive.playingcards.service

import edu.cnm.deepdive.playingcards.model.Card
import edu.cnm.deepdive.playingcards.model.Deck
import java.util.*

class Trick(deck: Deck) {

    private val _blackPile: MutableList<Card> = mutableListOf()
    private val _redPile: MutableList<Card> = mutableListOf()

    val blackPile: List<Card>
        get() = Collections.unmodifiableList(_blackPile)
    val redPile: List<Card>
        get() = Collections.unmodifiableList(_redPile)

    init {
        // TODO: Divide deck into redPile, blackPile; ignore the face-up cards.
    }

    fun swap(count: Int) {
        // TODO: Swap count cards between _redPile and _blackPile, as long as count <= size of smaller pile.
    }

}
