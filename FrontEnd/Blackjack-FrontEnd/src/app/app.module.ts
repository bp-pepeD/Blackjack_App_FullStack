import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BlackjackComponent } from './features/feature-blackjack/feature-blackjack.component';
import { FeatureBlackjackModule } from './features/feature-blackjack/feature-blackjack.module';

@NgModule({
  declarations: [
    AppComponent,
    BlackjackComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FeatureBlackjackModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
