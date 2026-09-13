import{
    add, subtract, multiply, divide, power, remainder
} from "./operations.js";

import { addToHistory } from "./history.js";

export function calculate(a,b,operation)
{
    const result = operation(a,b);

    addToHistory({
        expression:`${a} ${getOperator(operation)} ${b}`, result
    });

    return result;
}

function getOperator(operation)
{
    if(operation===add) return "+";
    if(operation===subtract) return "-";
    if(operation===multiply) return "*";
    if(operation===divide) return "/";
    if(operation===power) return "**";
    if(operation === remainder) return "%";

    return "?";
}