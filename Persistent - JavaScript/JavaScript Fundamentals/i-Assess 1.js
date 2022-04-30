var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();

palindrome(input);

function palindrome(str) 
{
    var re = /[\W_]/g;

    var lowRegStr = str.toLowerCase().replace(re,'');

    var reverseStr = lowRegStr.split('').reverse().join('');

    if( reverseStr === lowRegStr)
    {
        console.log(input + " is a palindrome");
    }
    else 
    {
        console.log(input + " is not a palindrome");
    }
}
