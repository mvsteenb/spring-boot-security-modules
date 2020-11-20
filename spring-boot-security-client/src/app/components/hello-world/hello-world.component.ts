import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HelloWorldService } from 'src/app/services/hello-world.service';

@Component({
  selector: 'app-hello-world',
  templateUrl: './hello-world.component.html',
  styleUrls: ['./hello-world.component.css']
})
export class HelloWorldComponent implements OnInit {

  welcomeMessage = '';

  constructor(
    private route: ActivatedRoute,
    private router: Router, 
    private helloWorldService: HelloWorldService
  ) { }

  ngOnInit(): void {
    this.helloWorldService.helloWorld().subscribe(
      res => { this.welcomeMessage = res.content; }
    );
  }

}
