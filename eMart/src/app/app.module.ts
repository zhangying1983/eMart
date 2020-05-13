import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'; 

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

@NgModule({
  declarations: [
    AppComponent
    ,LoginComponent, LoginComponent, SignupComponent, SellersignupComponent, BuyerhomeComponent, ItemdetailComponent, CartComponent, OrderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent, LoginComponent]
})
export class AppModule { }
