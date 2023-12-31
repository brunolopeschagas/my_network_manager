import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CustomResponse } from '../interface/custum-response';
import { Observable, throwError } from 'rxjs';
import {tap, catchError} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ServerService {
  private readonly apiUrl = 'any';
  
  constructor(private http: HttpClient) { }
  
  servers$ = this.http.get<CustomResponse>(`${this.apiUrl}/server/list`)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
    );

    handleError(handleError: any): Observable<never> {
      return throwError ('Method not implemented.');
    }
}
