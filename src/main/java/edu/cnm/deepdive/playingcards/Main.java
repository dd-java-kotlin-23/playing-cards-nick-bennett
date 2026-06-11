package edu.cnm.deepdive.playingcards;

import edu.cnm.deepdive.playingcards.model.Card;
import edu.cnm.deepdive.playingcards.model.Deck;
import edu.cnm.deepdive.playingcards.model.Suit;
import edu.cnm.deepdive.playingcards.model.Suit.Color;
import edu.cnm.deepdive.playingcards.service.Trick;
import edu.cnm.deepdive.playingcards.view.CardListView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.random.RandomGenerator;

public class Main {

  void main() {
    Deck deck = new Deck();
    deck.shuffle(RandomGenerator.getDefault());

    Trick trick = new Trick(deck);

    List<Card> blackPile = new ArrayList<>(trick.getBlackPile());
    List<Card> redPile = new ArrayList<>(trick.getRedPile());

    Comparator<Card> blackFirstComparator = new ColorComparator(false);
    Comparator<Card> redFirstComparator = new ColorComparator(true);

    blackPile.sort(blackFirstComparator);
    redPile.sort(redFirstComparator);

    long blackCount = blackPile
        .stream()
        .takeWhile((card) -> card.suit().color() == Color.BLACK)
        .count();

    long redCount = redPile
        .stream()
        .takeWhile((card) -> card.suit().color() == Color.RED)
        .count();

    System.out.printf("Black count = %2$d; black pile = %1$s%n", CardListView.toString(blackPile), blackCount);
    System.out.printf("Red count = %2$d; red pile = %1$s%n", CardListView.toString(redPile), redCount);
  }


  private static class ColorComparator implements Comparator<Card> {

    private static final Comparator<Card> COMPARATOR =
        Comparator.comparing(Card::suit, Comparator.comparing(Suit::color))
            .thenComparing(Comparator.naturalOrder());

    private final boolean colorReversed;

    public ColorComparator(boolean colorReversed) {
      this.colorReversed = colorReversed;
    }

    @Override
    public int compare(Card card1, Card card2) {
      return colorReversed
          ? COMPARATOR.reversed().compare(card1, card2)
          : COMPARATOR.compare(card1, card2);
    }

  }

}


