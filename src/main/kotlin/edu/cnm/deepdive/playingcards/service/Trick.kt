package edu.cnm.deepdive.playingcards.service

import edu.cnm.deepdive.playingcards.model.Card
import edu.cnm.deepdive.playingcards.model.Deck
import edu.cnm.deepdive.playingcards.model.Suit
import java.util.*

class Trick(deck: Deck) {

    private val _blackPile: MutableList<Card> = mutableListOf()
    private val _redPile: MutableList<Card> = mutableListOf()

    val blackPile: List<Card>
        get() = Collections.unmodifiableList(_blackPile)
    val redPile: List<Card>
        get() = Collections.unmodifiableList(_redPile)

    init {
        // DONE: Divide deck into redPile, blackPile; ignore the face-up cards.
        while (!deck.isEmpty) {
            val selector = deck.draw()
            val nextCard = deck.draw()
            if (selector.suit.color() == Suit.Color.BLACK) {
                _blackPile.add(nextCard)
            } else {
                _redPile.add(nextCard)
            }
        }
    }

    fun swap(count: Int) {
        // DONE: Swap count cards between _redPile and _blackPile, as long as count <= size of smaller pile.
        require(count <= _blackPile.size && count <= _redPile.size)
        for (i in 0 until count) {
            _blackPile.add(_redPile.removeFirst())
            _redPile.add(_blackPile.removeFirst())
        }
    }

}
