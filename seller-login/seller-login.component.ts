import { Component, OnInit } from '@angular/core';
import { Login } from '../model/login';

@Component({
  selector: 'app-seller-login',
  templateUrl: './seller-login.component.html',
  styleUrls: ['./seller-login.component.css']
})
export class SellerLoginComponent implements OnInit {
  login=new Login("","");

  constructor() { }

  ngOnInit() {
  }

}
