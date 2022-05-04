var fs = require('fs');
var name = fs.readFileSync('input.txt').toString();
let str = name.trim().split(",");

let Person = {
    name : str[0]
}

let Employee = {
    employeeId : str[1]
}

Employee.__proto__=Person;

console.log("Using inherited instance");
console.log("Name : " + Employee.name);
console.log("EmployeeId : " + Employee.employeeId);
