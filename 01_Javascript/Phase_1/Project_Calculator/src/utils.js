import {InvalidNumberError} from "./errors.js";

export function validateNumber(value){
    if(typeof value!== "number"|| Number.isNaN(value))
    {
        throw new InvalidNumberError(
            'Invalid value: ${value}'
        );
    }

    return value;
}

export function formatCalculation(calculation)
{
    const{
        expression, 
        result,
        metadatta
    }= calculation

    const unit = metadata?.unit ?? "number";

    return `${expression}=${result} ${unit}`;
}


export function formatHistory(history){
    return history
        .map(({expression, result})=> 
        `${expression}=${result}`
        )
        .join("\n");
}