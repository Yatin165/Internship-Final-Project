import { Component } from '@angular/core';
import { BookService } from 'src/app/Book Service/book.service';

@Component({
  selector: 'app-get-book',
  templateUrl: './get-book.component.html',
  styleUrls: ['./get-book.component.css']
})
export class GetBookComponent {
  bookfetched:any

  bookId:any;

  constructor(private service:BookService) {

  }

  getBookData() {
    console.log("button clicked");
    console.log(this.bookId);
    this.service.getBookData(this.bookId).subscribe(
      response => {
        this.bookfetched=response;
        console.log(this.bookfetched);
      },
      error => {
        console.log(error.error);
        alert(error.error);
      }
    )
   }

}
