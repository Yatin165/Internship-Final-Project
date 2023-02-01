import { Component } from '@angular/core';
import { BookService } from 'src/app/Book Service/book.service';

@Component({
  selector: 'app-return-book',
  templateUrl: './return-book.component.html',
  styleUrls: ['./return-book.component.css']
})
export class ReturnBookComponent {

  bookfetched:any;
  studentId: any;
  bookId: any;

  constructor(private service:BookService) {

  }

  returnBook() {
    console.log("button clicked");
    console.log(this.studentId,this.bookId);
    this.service.returnBook(this.studentId,this.bookId).subscribe(
      response => { 
        this.bookfetched=response;
        console.log(this.bookfetched);
        alert("Book returned");
      },
      error => {
        console.log(error.error.message);
        alert(error.error);
      }
   )
   }
}
