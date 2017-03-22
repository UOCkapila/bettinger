export class UserModel {
    // this variables should same as http responce
    constructor(
        public user_id?: string,
        public user_first_name?: string,
        public user_last_name?: string
    ) { }
}