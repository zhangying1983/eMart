import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';


@Component({
  selector: 'app-register-item',
  templateUrl: './register-item.component.html',
  styleUrls: ['./register-item.component.css']
})
export class RegisterItemComponent implements OnInit {


  errors = { 
    hasError: false
  };

  constructor(private router: Router, private http: HttpClient, private formBuilder: FormBuilder) {

  }


  ngOnInit(): void {
  }
  // TODO
  signUp(): boolean {
    return false;
  }
}
