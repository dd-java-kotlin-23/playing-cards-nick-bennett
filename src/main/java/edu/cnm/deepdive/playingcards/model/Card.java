package edu.cnm.deepdive.playingcards.model;

import java.util.Objects;

public class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank rank() {
    return rank;
  }

  public Suit suit() {
    return suit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, suit);
  }

  @Override
  public boolean equals(Object obj) {
    boolean equalityResult;
    if (this == obj) {
      equalityResult = true;
    } else if (obj instanceof Card other) {
      equalityResult = (this.rank == other.rank) && (this.suit == other.suit);
    } else {
      equalityResult = false;
    }
    return equalityResult;
  }

  @Override
  public String toString() {
    return rank + " " + suit;
  }

  @Override
  public int compareTo(Card other) {
    int comparisonResult = this.suit.compareTo(other.suit);
    if (comparisonResult == 0) {
      comparisonResult = this.rank.compareTo(other.rank);
    }
    return comparisonResult;
  }

}
