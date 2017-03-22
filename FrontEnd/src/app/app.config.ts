import { environment } from '../environments/environment';
export class AppConfig {
    // Setup base url
    static BASE_URL: string = environment.baseUrl;
    static API_VERSIONING: string = "api/v1";

    // request methods
    static GET: string = "get";
    static PUT: string = "put";
    static POST: string = "post";
    static DELETE: string = "delete";

    // all common variables put here as static values
}