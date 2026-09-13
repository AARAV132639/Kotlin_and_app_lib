import {add, subtract, multiply, divide, power, remainder} from "./operations.js"

import {calculate} from "./calculator.js";

import{
    getHistory, clearHistory
} from "./history.js";

import { getStatistics } from "./statistics.js";

import { formatHistory } from "./utils.js";

function main()
{
    try{
        console.log("--JS Calci--");
        console.log("Remainder:",calculate(20,5,remainder));

         const history = getHistory();
         console.log(getStatistics(history));
    }
    catch(error)
    {
        console.error(`${error.name}:${error.message}`);
    }
    finally 
    {
        console.log("\n Calculator finished");
    }  

}

main();