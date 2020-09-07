import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Signup } from '../model/signup';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  save(id: User): Observable<User> {
    throw new Error("Method not implemented.");
  }
 baseUrl:string;

  constructor(private httpClient: HttpClient) {
    this.baseUrl="http://localhost:4444/registrations";
   }
   getAll():Observable<User[]>{
    return this.httpClient.get<User[]>(this.baseUrl);
     
   }
   getById(id:number) :Observable<User>{
    return this.httpClient.get<User>(`${this.baseUrl}/${id}`);
 
   }
   add(signup:User): Observable<User>{
    return this.httpClient.post<User>(this.baseUrl,signup);
  }

}
