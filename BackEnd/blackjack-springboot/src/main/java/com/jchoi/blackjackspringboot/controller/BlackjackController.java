package com.jchoi.blackjackspringboot.controller;

import com.jchoi.blackjackspringboot.model.Action;
import com.jchoi.blackjackspringboot.service.BlackjackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
// TODO: technically unsafe
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/blackjack")
public class BlackjackController {
    private final BlackjackService blackjackService;

    public BlackjackController(BlackjackService blackjackService) {
        this.blackjackService = blackjackService;
    }

    // TODO: change response entity types to concrete

    @PostMapping("/game")
    public ResponseEntity<?> initializeGame() {
        return new ResponseEntity<>(blackjackService.initializeGame(), HttpStatus.CREATED);
    }

    @GetMapping("/game/{gameId}")
    public ResponseEntity<?> getCurrentGameState() {
        return new ResponseEntity<>(blackjackService.getCurrentGameState(), HttpStatus.OK);
    }

    //    @PostMapping("/game/{gameId}")
//    public ResponseEntity<?> updateGame(@RequestParam("action") Action action) {
//        return new ResponseEntity<>(blackjackService.updateGame(action), HttpStatus.OK);
//    }

//    TODO: to be deleted, for instructional purposes
    @PostMapping("/game/{gameId}")
    public ResponseEntity<?> updateGame(@RequestParam("action") String action) {
        return new ResponseEntity<>(blackjackService.updateGame(action), HttpStatus.OK);
    }
}
