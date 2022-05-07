import { Component, OnInit } from '@angular/core';
import { BlackjackService } from '../../services/blackjack.service';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {
  HIT = "HIT";
  STAND = "STAND";

  constructor(private blackjackService: BlackjackService) { };

  ngOnInit(): void {
  };

  playerAction(action: String) {
    this.blackjackService.updateGame(action).subscribe(data => {
      console.log(data);
    });
  }
}
