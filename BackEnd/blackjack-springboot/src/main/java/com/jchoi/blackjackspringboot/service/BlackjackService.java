package com.jchoi.blackjackspringboot.service;

import com.jchoi.blackjackspringboot.model.Action;
import com.jchoi.blackjackspringboot.model.Message;
import com.sun.tools.javac.Main;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//    public Message updateGame(Action action) {
//        return new Message(action + " performed");
//    }

    // TODO: to be deleted, for instructional purposes
    public Message updateGame(String action) {
        return new Message(action + " performed");
    }
}
