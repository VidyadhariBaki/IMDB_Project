import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class UserService {
  
 
 private baseUrl = 'http://localhost:3030';
  
 
 constructor(private http: HttpClient) { }

  



createUser(register: Object): Observable<Object> {
  
  console.log(register)
  
  return this.http.post(`${this.baseUrl}` + `/add`, register);
 
 }

  
