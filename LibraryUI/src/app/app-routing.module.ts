import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBookComponent } from './components/add-book/add-book.component';
import { AddStudentComponent } from './components/add-student/add-student.component';
import { AdminComponentComponent } from './components/admin-component/admin-component.component';
import { GetBookComponent } from './components/get-book/get-book.component';
import { GetStudentComponent } from './components/get-student/get-student.component';
import { IssueBookComponent } from './components/issue-book/issue-book.component';
import { LibraryUIComponent } from './components/library-ui/library-ui.component';
import { LibraryComponent } from './components/library/library.component';
import { ReturnBookComponent } from './components/return-book/return-book.component';

const routes: Routes = [
 
  {
    path:"library",
    component: LibraryComponent,
    pathMatch: 'full'
  },
  {
   path:"admin",
   component: AdminComponentComponent,
   pathMatch:'full'
  },
  {
    path:"getStudent",
    component: GetStudentComponent,
    pathMatch: 'full'
  },
  {
    path:"addStudent",
    component: AddStudentComponent,
    pathMatch: 'full'
  },
  {
    path:"getBook",
    component: GetBookComponent,
    pathMatch: 'full'
  },
  {
    path:"addBook",
    component: AddBookComponent,
    pathMatch: 'full'
  },
  {
    path:"libraryui",
    component: LibraryUIComponent,
    pathMatch: 'full'
  },
  {
    path:"issueBook",
    component: IssueBookComponent,
    pathMatch: 'full'
  },
  {
    path:"returnBook",
    component: ReturnBookComponent,
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
