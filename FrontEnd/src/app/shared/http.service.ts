import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { Cookie } from 'ng2-cookies/ng2-cookies';

@Injectable()
export class HttpService {

  constructor(private http: Http) { }

  private extractData(res: Response) {
    let body = res.json();
    return body || {};
  }

  private handleError(error: any) {
    let errMsg = (error.message) ? error.message :
      error.status ? `${error.status} - ${error.statusText}` : 'Server error';
    return Observable.throw(errMsg);
  }

  request(url: string, body: string, headers: any, method: string): Observable<any> {
    let reqHeader: Headers;
    if (!headers) {
      reqHeader = new Headers({
        'Content-Type': 'application/json',
        'authorization': 'Bearer ' + Cookie.get('token')
      });
    } else {
      reqHeader = new Headers(headers);
    }
    let options = new RequestOptions({ headers: reqHeader });
    if (!body) {
      return this.http[method](url, options).map(this.extractData).catch(this.handleError);
    } else {
      return this.http[method](url, body, options).map(this.extractData).catch(this.handleError);
    }
  }

}
