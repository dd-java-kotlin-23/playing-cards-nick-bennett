package edu.cnm.deepdive.playingcards;

import edu.cnm.deepdive.playingcards.model.Card;
import edu.cnm.deepdive.playingcards.model.Deck;
import java.util.random.RandomGenerator;

public class Main {

  void main() {
    Deck deck = new Deck();
    System.out.println(deck);
    deck.shuffle(RandomGenerator.getDefault());
    System.out.println(deck);
    Card card = deck.draw();
    System.out.println(card);
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
  }

}
