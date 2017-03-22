import { AppConfig } from '../../app.config';
export class RegistrationConfig {

    static API_AUTHENTICATE: string = AppConfig.BASE_URL + AppConfig.API_VERSIONING + "auth/login";

    // All routes - registrations
    static LOGIN: string = "login";
    static SIGNUP: string = "signup";

    static LOGIN_TITLE: string = "Bettinger Login";

    // common variables only for registrations, put here
}