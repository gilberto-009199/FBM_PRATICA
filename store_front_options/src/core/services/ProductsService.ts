import type AppService from "./AppService";
import { Observable, catchError, retry, throwError } from 'rxjs';


import Axios, { type AxiosObservable } from  'axios-observable';

export interface Message<T>{
    status: boolean
    data:T
}

export class ProductService{

    api: string;
    version: string = "v1/"
    endpoit : string = "product/"

    constructor( appService: AppService){
        this.api = appService.getHost() + "/" + this.version + this.endpoit
    }

    getAll():AxiosObservable<Message<any>>{
        console.log(this.api)
        return Axios.get<Message<any>>(this.api).pipe(
            retry(3)
        )
    }


    private handlerError(error : any){
        console.log("Erro in connection :")
        console.table(error)

        return throwError(() => new Error('Something bad happened; please try again later.'));
    }

}