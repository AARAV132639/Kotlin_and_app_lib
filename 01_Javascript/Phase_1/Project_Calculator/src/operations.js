export const add = (a,b)=> a+b;
export const subtract = (a,b)=> a-b;
export const multiply =(a,b)=> a*b;
import { DivisionByZeroError } from "./errors.js";


export const divide =(a,b)=>{
    if(b==0)
    {
        throw new DivisionByZeroError();
    }

    return a/b;
}

export const power = (a,b=2) => a**b;
export const remainder = (a,b) => a%b;

export const addMany =(...numbers)=> {
    let total =0;

    for(const number of numbers) total+=numbers

    return total;
};

export const multiplyMany =(...numbers)=>{
    let result =1;
    for(const number of numbers) result*=number;

    return result;
};