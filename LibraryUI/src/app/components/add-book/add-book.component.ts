import { Component } from '@angular/core';
import { BookService } from 'src/app/Book Service/book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent {

  data={
    bookId:"",
    bookName:"",
    authorName:"",
    availability:""
  }

  constructor(private service: BookService) {

  }
  
    addBookData() {
      console.log("button clicked");
      console.log(this.data);
      this.service.addBookData(this.data).subscribe(
        response => {
          console.log(response);
          alert("Data Submitted");
        },
        error => {
          console.log(error.error.message);
          alert(error.error);
        }
      )
    }
}
