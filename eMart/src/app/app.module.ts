import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'; 
import { HTTP_INTERCEPTORS } from '@angular/common/http'; 
import { FormsModule } from '@angular/forms'; 
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { SignupComponent } from './signup/signup.component';
import { SellersignupComponent } from './sellersignup/sellersignup.component';
import { BuyerhomeComponent } from './buyerhome/buyerhome.component';
import { ItemdetailComponent } from './itemdetail/itemdetail.component';
import { CartComponent } from './cart/cart.component';
import { OrderComponent } from './order/order.component';

import {AuthInterceptor} from './auth.interceptor';
import { RegisterItemComponent } from './register-item/register-item.component'


@NgModule({
  declarations: [
    AppComponent
    ,LoginComponent, LoginComponent, SignupComponent, SellersignupComponent, BuyerhomeComponent, ItemdetailComponent, CartComponent, OrderComponent, RegisterItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true }
  ],
  bootstrap: [AppComponent, LoginComponent]
})
export class AppModule { }
