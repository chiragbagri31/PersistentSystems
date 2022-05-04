var fs = require('fs');
var input=fs.readFileSync('input.txt').toString().trim().split('\n');

class Employee
{
    constructor(name, dept, DOJ)
    {
        this.name = name;
        this.dept = dept;
        this.DOJ = DOJ;
    }

    displayEmployee()
    {
        console.log("Name : " + this.name);
        console.log("Department : " + this.dept);
        console.log("DOJ : " + this.DOJ);
    }
}

let emp = new Employee(input[0], input[1], input[2]);
emp.displayEmployee();
