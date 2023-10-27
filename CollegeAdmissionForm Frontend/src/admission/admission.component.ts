import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-admission',
  templateUrl: './admission.component.html',
  styleUrls: ['./admission.component.scss']
})
export class AdmissionComponent implements OnInit{

  admissionForm !: FormGroup;
  constructor(private formBuilder: FormBuilder,private http:HttpClient) { }

  ngOnInit(): void {
    this.admissionForm = this.formBuilder.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      gender: ['', Validators.required],
      school: ['', Validators.required],
      sslcMark: ['', [Validators.required, Validators.min(0), Validators.max(100)]],
      hscMark: ['', [Validators.required, Validators.min(0), Validators.max(100)]],
      cutoff: ['', [Validators.required, Validators.min(0), Validators.max(200)]],
      preferredDepartment: ['']
    });
  }



  public onSubmit(data:any)
  {
    if (this.admissionForm.valid) {
      alert("Thanks for submiting the admission form");
      console.log(this.admissionForm.value);

    } else {
      alert('Please fill in all required fields and provide valid data.');
    }
    this.http.post('http://localhost:8080/student',data).subscribe(
      (response:any)=>
      {
        console.log('Data Inserted Suceesfully ',response);
      }
    )
  }
  
}
