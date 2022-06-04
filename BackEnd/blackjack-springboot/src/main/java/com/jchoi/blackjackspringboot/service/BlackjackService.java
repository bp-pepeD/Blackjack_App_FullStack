package com.jchoi.blackjackspringboot.service;

import com.jchoi.blackjackspringboot.model.Action;
import com.jchoi.blackjackspringboot.model.Message;
import org.springframework.stereotype.Service;

@Service
public class BlackjackService {

    // TODO: implement initialize game
    public Message initializeGame() {
        return new Message("initialized game");
    }

    // TODO: implement initialize game
    public Message getCurrentGameState() {
        return new Message("state of  game");
    }

    // TODO: implement update game
    public Message updateGame(Action action) {
        return new Message(action + " performed");
    }

}
