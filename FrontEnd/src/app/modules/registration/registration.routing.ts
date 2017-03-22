import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { SignuponeComponent } from './signupone/signupone.component';
import { RegistrationConfig } from './registration.config';

const routes: Routes = [
  { 
    path: '',   
    redirectTo: '/' + RegistrationConfig.LOGIN,
    pathMatch: 'full'
  },
  { path: RegistrationConfig.LOGIN, component: LoginComponent , data: { title: RegistrationConfig.LOGIN_TITLE }},
  
  { path: RegistrationConfig.SIGNUP, component: SignupComponent,
    children: [
      { path: 'one', component: SignuponeComponent}
    ]
  },
];

export const AppRoutingProviders: any[] = [ ];
export const RegistrationRoutes = RouterModule.forChild(routes);
