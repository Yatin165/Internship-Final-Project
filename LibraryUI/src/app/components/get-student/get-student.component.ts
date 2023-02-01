import { Component } from '@angular/core';
import { StudentService } from 'src/app/Student Service/student.service';

@Component({
  selector: 'app-get-student',
  templateUrl: './get-student.component.html',
  styleUrls: ['./get-student.component.css']
})
export class GetStudentComponent {

  studentfetched:any

  studentId:any;

  constructor(private service:StudentService) {

  }

  getStudentData() {
    console.log("button clicked");
    console.log(this.studentId);
    this.service.getStudentData(this.studentId).subscribe(
      response => {
        this.studentfetched=response;
        console.log(this.studentfetched);
      },
      error => {
        console.log(error.error);
        alert(error.error);
      }
    )
   }
}
