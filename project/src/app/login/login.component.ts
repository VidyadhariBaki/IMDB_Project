import { Component, OnInit } from '@angular/core';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { Router } from '@angular/router';
import  { LoginAccount } from '../loginAccount'
import { UserService } from '../user.service';
import { UserAccount } from '../userAccount';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
title:"Quickr Login Page"
  constructor(private fb: FormBuilder,private route:Router,private userService: UserService) { }
  loginForm: FormGroup;
 
  loginAccount:LoginAccount=new LoginAccount();
  userAccount:UserAccount=new UserAccount();
  ngOnInit() {
    this.loginForm=this.fb.group(
{
  email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
  password:['',[Validators.required,Validators.maxLength(15),Validators.minLength(6)]]

})
  }
  onLogin(){
    console.log("in login() method")
    console.log(this.loginAccount)
      this.userService.validateUser(this.loginAccount)
      .subscribe(data => console.log(data), error => console.log(error));
      this.loginAccount=new LoginAccount();
      console.log(this.loginAccount)
    this.route.navigateByUrl("product");
     }

}
