package edu.cnm.deepdive.playingcards.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.random.RandomGenerator;

public class Deck {

  private final List<Card> cards;

  private Iterator<Card> iterator;
  private int size;

  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
    reset();
  }

  private void reset() {
    iterator = cards.iterator();
    size = cards.size();
  }

  public void shuffle(RandomGenerator rng) {
    Collections.shuffle(cards, rng);
    reset();
  }

  public Card draw() throws NoSuchElementException {
    Card card = iterator.next();
    size--;
    return card;
  }

  public boolean isEmpty() {
    return !iterator.hasNext();
  }

  public void sort() {
    Collections.sort(cards);
    reset();
  }

  @Override
  public String toString() {
    return cards.subList(cards.size() - size, cards.size()).toString();
  }

}
