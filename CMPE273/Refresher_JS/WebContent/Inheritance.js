/**
 * 
 */
function Person(first, last, age, nat) 
{
    this.firstName = first;
    this.lastName = last;
    this.grades = age;
    this.nationality = nat;
 }

var stud1 = new Person("Aditya", "Parashar", 3.5, "Indian");
var stud2 = new Person("Bruce", "Lee", 4.0, "Chinese");

document.writeln("Name of the student is\t" + stud1.firstName+"\t"+stud1.lastName + ". Student's grades are" + stud1.grades+"\tand student's nationality is\t"+stud1.nationality);
document.writeln("Name of the student is\t" + stud2.firstName+"\t"+stud2.lastName + ". Student's grades are" + stud2.grades+"\tand student's nationality is\t"+stud2.nationality);