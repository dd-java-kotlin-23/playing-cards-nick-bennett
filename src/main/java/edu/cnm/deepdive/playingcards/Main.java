package edu.cnm.deepdive.playingcards;

import edu.cnm.deepdive.playingcards.model.Card;
import edu.cnm.deepdive.playingcards.model.Rank;
import edu.cnm.deepdive.playingcards.model.Suit;

public class Main {

  void main() {
    Card c1 = new Card(Rank.QUEEN, Suit.CLUBS);
    Card c2 = new Card(Rank.QUEEN, Suit.CLUBS);
    Card c3 = new Card(Rank.JACK, Suit.DIAMONDS);
    System.out.println(c1 + " equals " + c2 + "? " + c1.equals(c2));
    System.out.println(c1 + " equals " + c3 + "? " + c1.equals(c3));
  }

}
