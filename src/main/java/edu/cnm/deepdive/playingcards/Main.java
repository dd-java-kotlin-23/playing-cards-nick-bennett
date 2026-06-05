package edu.cnm.deepdive.playingcards;

import edu.cnm.deepdive.playingcards.model.Deck;
import edu.cnm.deepdive.playingcards.service.Trick;
import edu.cnm.deepdive.playingcards.view.CardListView;
import java.util.random.RandomGenerator;

public class Main {

  void main() {
    Deck deck = new Deck();
    deck.shuffle(RandomGenerator.getDefault());
    Trick trick = new Trick(deck);
    System.out.println(CardListView.toString(trick.getBlackPile()));
    System.out.println(CardListView.toString(trick.getRedPile()));
    trick.swap(3);
    System.out.println(CardListView.toString(trick.getBlackPile()));
    System.out.println(CardListView.toString(trick.getRedPile()));
  }

}
