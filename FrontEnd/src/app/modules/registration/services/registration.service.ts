import { Injectable } from '@angular/core';
import { RegistrationConfig } from '../registration.config';
import { AppConfig } from '../../../app.config';
import { HttpService } from '../../../shared/http.service';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class RegistrationService {

  constructor( private httpService: HttpService ) { }

  login(username: string, password: string): Observable<any> {
    let body = JSON.stringify({
      'username': username,
      'password': password
    });
    let header = {'Content-Type': 'application/json'};
    return this.httpService.request(RegistrationConfig.API_AUTHENTICATE, body, header, AppConfig.POST);
  }

}
