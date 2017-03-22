import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

import { RegistrationRoutes, AppRoutingProviders } from './registration.routing';
import { SignuponeComponent } from './signupone/signupone.component';
import { RegistrationService } from './services/registration.service';
import { SharedModule } from '../../shared/shared.module'

@NgModule({
  declarations: [ LoginComponent, SignupComponent, SignuponeComponent ],
  imports: [
    CommonModule,
    RegistrationRoutes,
    SharedModule
  ],
  providers: [ AppRoutingProviders, RegistrationService ]
})
export class RegistrationModule { }
