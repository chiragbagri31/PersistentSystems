var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var spl = input.trim();
var array = spl.split('\n');

performOperation(Number(array[0]), Number(array[1]), Number(array[2]));

function performOperation(choice, a, b)
{
    if(choice==1)
    {
        console.log(a+b);
    }
    if(choice==2)
    {
        console.log(a-b);
    }
    if(choice==3)
    {
        console.log(a*b);
    }
    if(choice==4)
    {
        console.log(a/b);
    }
}
