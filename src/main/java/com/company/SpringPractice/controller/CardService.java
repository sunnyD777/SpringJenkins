package com.company.SpringPractice.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CardService {

    List<Card> cards =  new ArrayList<>(Arrays.asList(
            new Card("Stardust Dragon", "Synchro"),
            new Card("Elemental Hero Flame Wingman", "Fusion")
    ));

    public List<Card> getCards(){
        return cards;
    }

    public Card getCard(String type){
        return cards.stream().filter(card -> card.getType().equals(type)).findFirst().get();
    }

    public void addCard(Card card){
        cards.add(card);
    }
}
