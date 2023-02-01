import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseurl: string = "http://localhost:9090";
  private baseurl2: string = "http://localhost:8082";

  constructor(private http: HttpClient) { }

  getBookData(id: any) {
    // return this.http.get(`${this.baseurl}/fetchStudent/${id}`)  //PathVariable
    return this.http.get(`${this.baseurl}/getBook?id=${id}`) //Reqparam
  }

  addBookData(data: any) {
    return this.http.post(`${this.baseurl}/addBook`, data)
  }

  issueBook(studentId: any,bookId: any){
    return this.http.get(`${this.baseurl2}/issueBook?studentId=${studentId}&bookId=${bookId}`)
  }

  returnBook(studentId: any,bookId: any){
    return this.http.get(`${this.baseurl2}/returnBook?studentId=${studentId}&bookId=${bookId}`)
  }
  
}
