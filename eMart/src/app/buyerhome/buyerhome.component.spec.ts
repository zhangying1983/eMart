import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyerhomeComponent } from './buyerhome.component';

describe('BuyerhomeComponent', () => {
  let component: BuyerhomeComponent;
  let fixture: ComponentFixture<BuyerhomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuyerhomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuyerhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
