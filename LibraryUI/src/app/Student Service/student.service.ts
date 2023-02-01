import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseurl:string="http://localhost:8082";

  constructor(private http:HttpClient) { }

  addStudent(data:any){
    return this.http.post(`${this.baseurl}/addStudent`,data)
  }

  getStudentData(id:any){
    // return this.http.get(`${this.baseurl}/fetchStudent/${id}`)  //PathVariable
      return this.http.get(`${this.baseurl}/getStudent?id=${id}`) //Reqparam
    }
}
