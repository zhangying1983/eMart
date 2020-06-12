import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {


  errors = { 
    hasError: false
  };

  constructor(private router: Router, private http: HttpClient, private formBuilder: FormBuilder) {

  }


  ngOnInit(): void {
  }
  // TODO
  signUp(): boolean {
    this.errors.username = "";
    this.errors.confirmPassword = "";
    this.errors.hasError = false
    if(this.password.value !== this.confirmPassword.value){
      this.errors.confirmPassword = "password not match."
      this.errors.hasError = true
    }
    this.http.get('api/user/' + this.username.value + "/exist").toPromise().then((result: any) => {
      if(!result){
        this.errors.username = "user has already exist."
        this.errors.hasError = true
      }
      if(this.errors.hasError){
        return false
      }
      this.http.post('/api/user/buyer', {
        "username": this.username.value,
        "password": this.password.value,
        "email": this.email.value,
        "mobileNumber": this.mobileNumber.value
      })
        .toPromise().then((result: any) => {
          this.router.navigate(["/login"])
        });
    })
    return false;
  }
}
