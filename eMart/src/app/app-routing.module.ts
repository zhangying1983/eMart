import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { BuyerhomeComponent } from './buyerhome/buyerhome.component';
import { ItemdetailComponent} from './itemdetail/itemdetail.component';
import { CartComponent } from './cart/cart.component';
import { OrderComponent } from './order/order.component';
import { SellersignupComponent } from './sellersignup/sellersignup.component'

const routes: Routes = [{
  path: 'login',
  component: LoginComponent
},{
  path: 'signup',
  component: SignupComponent
},{
  path: 'buyerhome',
  component: BuyerhomeComponent
},{
  path: 'itemdetail',
  component: ItemdetailComponent
},{
  path: 'cart',
  component: CartComponent
},{
  path: 'order',
  component: OrderComponent
},{
  path: 'sellersignup',
  component: SellersignupComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
