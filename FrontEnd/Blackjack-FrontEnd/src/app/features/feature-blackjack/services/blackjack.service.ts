import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";

@Injectable({
  providedIn: 'root'
})
export class BlackjackService {
  url = `${environment.api_endpoint}/api/blackjack`;

  constructor(private httpclient: HttpClient) { };

  // TODO: Observable<any> should change to concrete types
  initializeGame(): Observable<any> {
    // TODO: should give some sort of user info to create new game
    // for now, assuming 1 user for simplicity
    return this.httpclient.post<any>(`${this.url}/game`, {});
  };

  getCurrentGameState(): Observable<any> {
    // TODO: game id should be a query param
    // for now, assuming 1 user for simplicity = 1 game with id 1
    return this.httpclient.get<any>(`${this.url}/game/1`)
  };

  updateGame(action: String): Observable<any> {
    // TODO: game id should be a query param
    // for now, assuming 1 user for simplicity = 1 game with id 1
    return this.httpclient.post<any>(`${this.url}/game/1?action=${action}`, {})
  };


}

