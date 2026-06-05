package edu.cnm.deepdive.playingcards.util;

import edu.cnm.deepdive.playingcards.model.Card;
import java.util.Comparator;

public class ColorComparator implements Comparator<Card> {

  private final boolean colorReversed;

  public ColorComparator(boolean colorReversed) {
    this.colorReversed = colorReversed;
  }

  @Override
  public int compare(Card card1, Card card2) {
    int comparisonResult =
        card1.suit().color().compareTo(card2.suit().color()) * (colorReversed ? -1 : 1);
    if (comparisonResult == 0) {
      comparisonResult = card1.compareTo(card2);
    }
    return comparisonResult;
  }

}
