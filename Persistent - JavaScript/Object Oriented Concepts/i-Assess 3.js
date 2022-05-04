var fs = require('fs');
var input=fs.readFileSync('input.txt').toString().trim().split('\n');

class Customer
{
    constructor(name)
    {
        this.name = name;
    }

    sayWelcome()
    {
        console.log("Welcome " + this.name);
    }
}

let customer = new Customer(input);
customer.sayWelcome();
