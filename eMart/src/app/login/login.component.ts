import { Component, OnInit, SystemJsNgModuleLoader } from '@angular/core';
import { Router} from '@angular/router'; 
import { HttpClient } from '@angular/common/http'; 
import { System } from '../system'
import { User } from '../user'
import { FormBuilder } from '@angular/forms';
import { FormGroup }                 from '@angular/forms';

import { FormControl }                 from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userType : string = ""
  username = new FormControl('');
  password = new FormControl('');
  constructor(private router: Router, private http: HttpClient, private formBuilder: FormBuilder) { 
    
  }

  ngOnInit(): void {
  }

  login() : void {
    debugger
    let token = "Basic " + btoa(this.username.value + ":" + this.password.value);
    this.http.get('/api/user/current', {headers:{"Authorization":token}}).toPromise().then((result: any)=>{
      System.user = result;
      this.router.navigate(["/buyerhome"])
    })
  }

  jumpDetail(itemId) : void{
    this.router.navigate(["/itemdetail"])
  }

}
