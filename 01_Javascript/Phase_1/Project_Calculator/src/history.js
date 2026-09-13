const history =[];

export function addToHistory(calculation){
    history.push(calculation);
}

export function getHistory(){
    return [...history];//using spread operator to return a copy
} 

export function clearHistory(){
    history.length =0;
}