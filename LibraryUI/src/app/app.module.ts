import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/navbar.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import { AdminComponentComponent } from './components/admin-component/admin-component.component';
import { LibraryComponent } from './components/library/library.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import { StudentService } from './Student Service/student.service';
import { HttpClientModule } from '@angular/common/http';
import { GetStudentComponent } from './components/get-student/get-student.component';
import { FormsModule } from '@angular/forms';
import {MatTabsModule} from '@angular/material/tabs';
import {MatListModule} from '@angular/material/list';
import { AddStudentComponent } from './components/add-student/add-student.component';
import { GetBookComponent } from './components/get-book/get-book.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { LibraryUIComponent } from './components/library-ui/library-ui.component';
import { IssueBookComponent } from './components/issue-book/issue-book.component';
import { ReturnBookComponent } from './components/return-book/return-book.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AdminComponentComponent,
    LibraryComponent,
    GetStudentComponent,
    AddStudentComponent,
    GetBookComponent,
    AddBookComponent,
    LibraryUIComponent,
    IssueBookComponent,
    ReturnBookComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    HttpClientModule,
    MatTabsModule,
    MatListModule,
    FormsModule
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
