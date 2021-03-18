import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TpscomponentComponent } from './tpscomponent.component';

describe('TpscomponentComponent', () => {
  let component: TpscomponentComponent;
  let fixture: ComponentFixture<TpscomponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TpscomponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TpscomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
