import { Component, OnInit } from '@angular/core';
import { Login } from '../model/login';
import { Ulogin } from '../model/ulogin';
import { LserviceService } from '../service/lservice.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  login=new Login("","");
  
  user:Ulogin 
  msg: string;
  isNew: boolean;
  


  constructor(private userService: LserviceService,
    private actRoute: ActivatedRoute,
    private router: Router)  { }

  ngOnInit():void {
    

    let userId = this.actRoute.snapshot.params.id;

    if (userId) {
      this.isNew = false;
      this.userService.getById(userId).subscribe(
        (data) => {
          this.user = data;
        }
      );
    } else {
      this.isNew = true;
      this.user = {
        userId: 0,
        userName: '',
        userpassword: '',
       
      };
    }

  }
  signIn(){
    // alert("tgyhuj");
    if(localStorage){
      var name=(<HTMLInputElement>document.getElementById("userName")).value;
      localStorage.setItem("userId",name);
      let id=localStorage.getItem("userId");
      this.router.navigateByUrl("buyer");
    }
   }
  
}	

