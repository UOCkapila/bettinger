import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { CanActivate } from '@angular/router';
import { Cookie } from 'ng2-cookies/ng2-cookies';

@Injectable()
export class AuthguardService {

  constructor(private router: Router) { }

  canActivate() {

    if (!Cookie.get('token')) {
      this.router.navigate(['']);
      return false;
    }
    return true;
  }

}
