import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUser';

  public user: User;

  constructor(private http: HttpClient) {

  }

  authenticationService(username: String, password: String) {
    let authToken = this.createBasicAuthToken(username, password);
    return this.http.get(`http://localhost:8080/api/v1/basicauth`,
      { headers: { authorization:  authToken } }).pipe(map((res) => {
        this.user = new User();
        this.user.username = username.toString();
        this.user.password = password.toString();
        this.user.authdata = authToken;
        sessionStorage.setItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME, JSON.stringify(this.user));
      }));
  }

  createBasicAuthToken(username: String, password: String) {
    return 'Basic ' + window.btoa(username + ":" + password)
  }

  logout() {
    sessionStorage.removeItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME);
    this.user = null;
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
    if (user === null) return false
    return true
  }

  getLoggedInUser() : User {
    let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
    if (user === null) 
      return null;
    return JSON.parse(user);
  }
}