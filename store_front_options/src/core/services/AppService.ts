
declare module globalThis {    let backend: string;}


export default class AppService{
    
    host: string = globalThis.backend ? globalThis.backend : "http://localhost:8080";
    
    getHost(){
        return this.host;
    }
}