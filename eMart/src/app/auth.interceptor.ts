import { Injectable } from "@angular/core";
import { HttpEvent, HttpRequest, HttpHandler, HttpInterceptor, HttpErrorResponse } from "@angular/common/http";
import { catchError, tap } from 'rxjs/operators';
import { Observable, throwError } from "rxjs";

import { Router} from '@angular/router';    
import {System} from './system'

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
  
constructor(private router: Router) {}

  intercept(
    req: HttpRequest<any>,
    next: HttpHandler,
  ): Observable<HttpEvent<any>> {
    let clonedRequest = req
    
    if(System.user){
        let token = "Basic " + btoa(System.user.username + ":" + System.user.password);
        clonedRequest = req.clone({
            headers: req.headers.set("Authorization", token)
          });
    }
//      else if(req.url.indexOf('/api/user/current') < 0

// && !(req.url.indexOf('/api/user') >= 0 && req.method == 'POST')){
//         this.router.navigate(["/login"])
//         return
//     }
    console.log("new headers", clonedRequest.headers.keys());
    return next.handle(clonedRequest).pipe(
        tap(event=>{
            
        }),
        catchError(error => {
        
        if (error instanceof HttpErrorResponse && error.status === 401) {
        //   return this.handle401Error(request, next);
        
        this.router.navigate(["/login"])
        } else {
          return throwError(error);
        }
      }));
  }
}