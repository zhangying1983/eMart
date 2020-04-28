import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router'; 

@Component({
  selector: 'app-buyerhome',
  templateUrl: './buyerhome.component.html',
  styleUrls: ['./buyerhome.component.css']
})
export class BuyerhomeComponent implements OnInit {

  constructor(private router: Router) { }

  items = [{itemName:"Apple",itemId:1,price:999999,category:"Phone",sellerName:"HUAWEI"}];

  ngOnInit(): void {
  }

  search(): void{
    alert(1)
  }

  jumpDetail(itemId) : void{
    this.router.navigate(["/itemdetail"])
  }
}
