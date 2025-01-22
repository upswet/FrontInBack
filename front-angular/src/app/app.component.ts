import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { timer } from 'rxjs';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  baseUrl:string=window.location.origin;
  data:string = 'пусто';

  constructor(private httpClient: HttpClient) {}

  ticks =0;
  ngOnInit(){
    let timer$ = timer(2000,3000);
    timer$.subscribe((t: number)=>{
      this.ticks = t
      this.httpClient.get(this.baseUrl+"/api/v1/test/random").subscribe(
        value =>{
         this.data=value.toString();
        },
        error => {console.log(error)}
      );
    });
  }
}
