package edu.cnm.deepdive.playingcards.model;

public record Card(Rank rank, Suit suit) implements Comparable<Card> {

  @Override
  public int compareTo(Card other) {
    int comparisonResult = this.suit.compareTo(other.suit);
    if (comparisonResult == 0) {
      comparisonResult = this.rank.compareTo(other.rank);
    }
    return comparisonResult;
  }

}
