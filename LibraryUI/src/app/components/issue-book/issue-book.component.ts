import { Component } from '@angular/core';
import { BookService } from 'src/app/Book Service/book.service';

@Component({
  selector: 'app-issue-book',
  templateUrl: './issue-book.component.html',
  styleUrls: ['./issue-book.component.css']
})
export class IssueBookComponent {

  bookfetched:any;
  studentId: any;
  bookId: any;
  constructor(private service:BookService) {

  }

  issueBook() {
    console.log("button clicked");
    console.log(this.studentId,this.bookId);
    this.service.issueBook(this.studentId,this.bookId).subscribe(
      response => {
        this.bookfetched=response;
        console.log(this.bookfetched);
        alert("Book Issued");
      },
      error => {
        console.log(error.error.message);
        alert(error.error);
      }
   )
   }
}
