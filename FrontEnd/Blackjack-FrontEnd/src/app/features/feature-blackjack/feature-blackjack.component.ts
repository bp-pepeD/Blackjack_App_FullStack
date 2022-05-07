import { Component, OnInit } from '@angular/core';
import { BlackjackService } from './services/blackjack.service';


@Component({
  selector: 'app-blackjack',
  templateUrl: './feature-blackjack.component.html',
  styleUrls: ['./feature-blackjack.component.css']
})
export class BlackjackComponent implements OnInit {
  title = 'Blackjack feature';

  constructor(private blackjackService: BlackjackService) { };

  ngOnInit(): void {
    this.blackjackService.initializeGame().subscribe(data => {
      console.log(data);
    });
    this.blackjackService.getCurrentGameState().subscribe(data => {
      console.log(data);
    });
  };
}
