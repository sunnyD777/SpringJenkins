package com.company.SpringPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CardService cardService;

    @RequestMapping("/test")
    public String test(){
        return "SPRING API ANA";
    }

    @RequestMapping("/cards")
    public List<Card> getCards(){
        return cardService.getCards();
    }

    @RequestMapping("/cards/{type}")
    public Card getCard(@PathVariable String type){
        return cardService.getCard(type);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cards")
    public void addCard(@RequestBody Card card){
        cardService.addCard(card);
    }
}
