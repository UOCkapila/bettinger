import { Component, OnInit } from '@angular/core';
import { RegistrationService } from '../services/registration.service';
import { Cookie } from 'ng2-cookies/ng2-cookies';
import { UserModel } from '../../models/user-model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user = new UserModel;

  constructor(private registrationService: RegistrationService) { }

  ngOnInit() {
  }

  login() {
    this.registrationService.login('username', 'password').subscribe(
      result => {
        console.log(result);
        this.user = result.user;
        console.log(this.user.user_id);
        // add token to cookie here
      }, error => {
        console.log(error);
      }
    );
  }

}
