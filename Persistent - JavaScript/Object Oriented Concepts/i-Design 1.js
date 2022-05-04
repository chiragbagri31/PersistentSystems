var fs = require('fs');
var input=fs.readFileSync('input.txt').toString().trim().split('\n');

// to seperate comma strings
var input1 = input[0].trim().split(',');
var input2 = input[1].trim().split(',');

function SuperHero(name, alias, planet)
{   
    this.name = name;
    this.alias = alias;
    this.planet = planet;
}

SuperHero.prototype.WhoAmI = function()
{
    console.log(this.name + " " + this.alias + " is from the planet " + this.planet);
}

const Superman = new SuperHero(input1[0], input1[1], input1[2]);
const Batman = new SuperHero(input2[0], input2[1], input2[2]);

Superman.WhoAmI();
Batman.WhoAmI();
