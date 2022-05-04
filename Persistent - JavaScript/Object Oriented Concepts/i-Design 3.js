var fs = require('fs');
var input=fs.readFileSync('input.txt').toString().trim().split('\n');

var input1 = input[0].trim().split(',');
var input2 = input[1].trim().split(',');
var input3 = input[2].trim().split(',');

class Shape
{
    constructor(name, nos, color)
    {
        this.name = name;
        this.nos = nos;
        this.color = color;
    }
    
    displayShapeColor()
    {
        console.log(this.name + " is in color " + this.color);
    }
}

class Cricle extends Shape
{
    displayShapeSides()
    {
        console.log(this.name + " has " + this.nos + " sides");
    }
}

class Square extends Shape
{
    displayShapeSides()
    {
        console.log(this.name + " has " + this.nos + " sides");
    }
}

class Triangle extends Shape
{
    displayShapeSides()
    {
        console.log(this.name + " has " + this.nos + " sides");
    }
}

var circle = new Cricle(input1[0], input1[1], input1[2]);
var square = new Square(input2[0], input2[1], input2[2]);
var triangle = new Triangle(input3[0], input3[1], input3[2]);

circle.displayShapeColor();
circle.displayShapeSides();

square.displayShapeColor();
square.displayShapeSides();

triangle.displayShapeColor();
triangle.displayShapeSides();
