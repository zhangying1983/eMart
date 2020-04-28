import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  constructor() { }

  items = [{itemName:"Pro11",itemId:1,price:999999,category:"Phone",sellerName:"HUAWEI",number:3},
  {itemName:"Apple11",itemId:1,price:999999,category:"Phone",sellerName:"HUAWEI",number:3}];

  ngOnInit(): void {
  }

}
