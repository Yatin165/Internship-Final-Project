import { Component } from '@angular/core';
import { StudentService } from 'src/app/Student Service/student.service';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent {

  data={
    studentId:"",
    name:"",
    emailId:"",
    phoneNumber:""
  }

constructor(private service: StudentService) {

}

  addStudent() {
    console.log("button clicked");
    console.log(this.data);
    this.service.addStudent(this.data).subscribe(
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
