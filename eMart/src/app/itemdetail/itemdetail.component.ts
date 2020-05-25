import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router'; 
@Component({
  selector: 'app-itemdetail',
  templateUrl: './itemdetail.component.html',
  styleUrls: ['./itemdetail.component.css']
})
export class ItemdetailComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  jumpHome() : void{
    this.router.navigate(["/buyerhome"])
  }
}
