import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ShoeComponent } from './components/shoe/shoe.component';
import { PlayerComponent } from './components/player/player.component';
import { DealerComponent } from './components/dealer/dealer.component';
import { BlackjackService } from './services/blackjack.service';

@NgModule({
  declarations: [
    ShoeComponent,
    PlayerComponent,
    DealerComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    ShoeComponent,
    PlayerComponent,
    DealerComponent,
  ]
})
export class FeatureBlackjackModule { }
