import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LibraryUIComponent } from './library-ui.component';

describe('LibraryUIComponent', () => {
  let component: LibraryUIComponent;
  let fixture: ComponentFixture<LibraryUIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LibraryUIComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LibraryUIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
