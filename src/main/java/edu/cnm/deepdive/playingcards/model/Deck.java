package edu.cnm.deepdive.playingcards.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

  private final List<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
  }


}
