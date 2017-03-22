import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { Http } from '@angular/http';
import { TranslateModule, TranslateLoader, TranslateStaticLoader } from "ng2-translate";

import { AppComponent } from './app.component';
import { AppRoutes, AppRoutingProviders } from './app.routing';

import { RegistrationModule } from './modules/registration/registration.module';
import { AuthguardService } from './shared/authguard.service';
import { HttpService } from './shared/http.service';

export function createTranslateLoader(http: Http) {
    return new TranslateStaticLoader(http, './assets/i18n', '.json');
}

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RegistrationModule,
    AppRoutes,
    TranslateModule.forRoot({
            provide: TranslateLoader,
            useFactory: (createTranslateLoader),
            deps: [Http]
        })
  ],
  providers: [ 
    AppRoutingProviders,
    AuthguardService,
    HttpService
  ],
  bootstrap: [ AppComponent ]
})

export class AppModule { }