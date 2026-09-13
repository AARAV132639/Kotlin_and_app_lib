export class DivisionByZeroError extends Error{
    constructor(){
        super("Cannot divide by zero");
        this.name = "DivisionByZeroError";
    }
}

export class InvalidNumberError extends Error{
    constructor(message="Invalid"){
        super(message);
        this.name = "Invalid Number Error";
    }
}