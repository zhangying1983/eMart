import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http'; 

@Component({
  selector: 'app-buyerhome',
  templateUrl: './buyerhome.component.html',
  styleUrls: ['./buyerhome.component.css']
})
export class BuyerhomeComponent implements OnInit {

  constructor(private router: Router, private http: HttpClient) { }

  items = [];

  ngOnInit(): void {
    this.search()
  }

  search(): void {
    this.http.get("api/item?itemName=" + "")
    .toPromise()
    .then((result: any) => { this.items = result.content})
  }

  jumpDetail(itemId): void {
    this.router.navigate(["/itemdetail"])
  }
}
