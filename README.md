# HW_Week2_Day2_ClassInitialization
---
The Home Work has to be delievered before 9AM: ⚠️

> Note: You must save all your solution as `solution.kt` to be submitted before 9AM. ⚠️
# Instructions 📋

## Part I 
---
### Write a class named 'Student' with with following features:

Privete properties:
- fName for the student's first name of type String.
- lName for the student's last name of type String.
- testScore for the student's test score of type int.

Initialization:
- Initializer block which initialize the class properties.
- Or
- Use secondry constructor to assign properties.


Class functions:
- addTest() will take name and score as parameters and the score should be between 0 and 100. Then it will return a map item <name,score>, name as key and score as value.
- displayTests() will display the map of tests as list of student name and scores.


How it works:
- Declare a map to store tests which take the full name as key and score as value.
- Prompt the user to input frist and last name, and score.
- Use custom getters to get values for frist name, and last name in capitalized form.
- store full name and score to the declared map
- Print a list of all students and scores.


## Part II - Bonus Challenge 
Add the following features to the previous class:

Class functions:
- search() which takes student's name as parameter to return the name of student and his score.
- getAvr() which takes map as parameter and returns the average of students' scores.
- honList() which takes map and returns printed list of honor students whose scores are more than 90.




