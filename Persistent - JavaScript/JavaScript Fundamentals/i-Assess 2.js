var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();

checkPrime(Number(input));

function checkPrime(n)
{
    let isPrime = true;
    for(i=2; i<n; i++)
    {
        if(n%i==0)
        {
            isPrime = false;
            break;
        }
    }
    if(n<2)
    {
        isPrime = false;
    }

    if(isPrime == true)
    {
        console.log("Prime");
    }
    else
    {
        console.log("Not Prime");
    }
}
