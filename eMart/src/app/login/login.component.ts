import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router'; 

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userType = {}
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  login() : void {
    this.router.navigate(["/buyerhome"])
  }

  jumpDetail(itemId) : void{
    this.router.navigate(["/itemdetail"])
  }

}
