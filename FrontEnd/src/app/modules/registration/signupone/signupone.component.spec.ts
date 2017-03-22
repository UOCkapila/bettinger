import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SignuponeComponent } from './signupone.component';

describe('SignuponeComponent', () => {
  let component: SignuponeComponent;
  let fixture: ComponentFixture<SignuponeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SignuponeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SignuponeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
