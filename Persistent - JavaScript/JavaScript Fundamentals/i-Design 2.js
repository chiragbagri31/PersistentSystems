var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var age = Number(input);

checkAge(age);

function checkAge(age)
{
    if(age>=18)
    {
        console.log("Allowed");
    }
    if(age<18)
    {
        console.log("Not Allowed");
    }
}
