### Instructions
Exercise from https://exercism.org/tracks/java/exercises/tim-from-marketing

In this exercise you'll be writing code to print name badges for factory employees.

`1. Print a badge for an employee` </br>

Employees have an ID, name and department name. Employee badge labels are formatted as follows: "[id] - name - DEPARTMENT". Implement the Badge.print() method to return an employee's badge label:
```
Badge badge = new Badge();
badge.print(734, "Ernest Johnny Payne", "Strategic Communication");
// => "[734] - Ernest Johnny Payne - STRATEGIC COMMUNICATION"
Note that the department should be uppercased on the label.
```
`2. Print a badge for a new employee` </br>

Due to a quirk in the computer system, new employees occasionally don't yet have an ID when they start working at the factory. As badges are required, they will receive a temporary badge without the ID prefix. Modify the Badge.print() method to support new employees that don't yet have an ID:
```
Badge badge = new Badge();
Badge.print(null, "Jane Johnson", "Procurement");
// => "Jane Johnson - PROCUREMENT"
```
`3. Print a badge for the owner` </br>

Even the factory's owner has to wear a badge at all times. However, an owner does not have a department. In this case, the label should print "OWNER" instead of the department name. Modify the Badge.print() method to print a label for the owner:
```
Badge badge = new Badge();
badge.print(254, "Charlotte Hale", null);
// => "[254] - Charlotte Hale - OWNER"
Note that it is possible for the owner to also be a new employee:

Badge badge = new Badge();
badge.print(null, "Charlotte Hale", null);
// => "Charlotte Hale - OWNER"
```