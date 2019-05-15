import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule,routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { LoginComponent } from './login/login.component';
import { RegComponent } from './reg/reg.component';
import { ReactiveFormsModule }    from '@angular/forms';
import { ShowHidePasswordModule } from 'ngx-show-hide-password';
import { AngularEntypoModule } from 'angular-entypo';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    ProductComponent,
    LoginComponent,
   RegComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule, HttpClientModule,
     ShowHidePasswordModule.forRoot(),AngularEntypoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
