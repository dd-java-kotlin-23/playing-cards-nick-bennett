package edu.cnm.deepdive.playingcards.model;

public enum Suit {

  CLUBS(Color.BLACK),
  DIAMONDS(Color.RED),
  HEARTS(Color.RED),
  SPADES(Color.BLACK);

  private final Color color;

  private Suit(Color color) {
    this.color = color;
  }

  public Color color() {
    return color;
  }

  public enum Color {
    BLACK, RED
  }

}
