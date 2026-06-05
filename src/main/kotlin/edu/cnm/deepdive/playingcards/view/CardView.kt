package edu.cnm.deepdive.playingcards.view

import edu.cnm.deepdive.playingcards.model.Card
import edu.cnm.deepdive.playingcards.model.Rank
import edu.cnm.deepdive.playingcards.model.Suit

object CardView {

    private val suitSymbols: Map<Suit, Char> = mapOf(
        Suit.CLUBS to '\u2663',
        Suit.DIAMONDS to '\u2662',
        Suit.HEARTS to '\u2661',
        Suit.SPADES to '\u2660',
    )

    private val rankSymbols: Map<Rank, String> = mapOf(
        Rank.ACE to "A",
        Rank.TWO to "2",
        Rank.THREE to "3",
        Rank.FOUR to "4",
        Rank.FIVE to "5",
        Rank.SIX to "6",
        Rank.SEVEN to "7",
        Rank.EIGHT to "8",
        Rank.NINE to "9",
        Rank.TEN to "10",
        Rank.JACK to "J",
        Rank.QUEEN to "Q",
        Rank.KING to "K",
    )

    fun toString(card: Card): String {
        return "${rankSymbols[card.rank]} ${suitSymbols[card.suit]}"
    }
}