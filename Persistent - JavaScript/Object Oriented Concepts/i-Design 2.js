var fs = require('fs');
var input = fs.readFileSync('input.txt').toString().trim().split('\n');

class User
{
    constructor(userName)
    {
        this.userName = userName;
    }

    getName()
    {
        return this.userName;
    }
}

function checkNameLength(personName)
{
    let name = personName.getName();

    if(name.length>4)
    {
        console.log(name);
    }
    else
    {
        console.log("Name is too short");
    }
}
var personName = new User(input[0]);
checkNameLength(personName);
