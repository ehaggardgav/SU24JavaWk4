For this assignment, we will be creating a grade retrieval program.

1. Create an array (or ArrayList) of students and their grades. You are free to structure this data however you like (2D or multiple arrays). The student ID will correspond to the index in the array. Grades must be stored as numerical values (0-100).

Example:

roster = [amy, jamy, tamy]

grades = [97, 65, 87]

Amy: SID=0, Grade=97

Jamy: SID=1, Grade=65

Tamy: SID=2, Grade=87

2. Create a prompt to ask the student for their name and respond with their student ID. If the name does not exist, notify the user and repeat until a valid name or 'x' is entered. You must do this manually by looping through each element in the array, do not use an array method like .contains().

3. Prompt the user to enter their student ID and return their letter grade (by converting the numerical value into the corresponding letter). Do not store the letter grade in the grades array (or any other data structure). Use the following grading scale:

A = 93+; A - = 90 - 92

B+ = 87 - 89; B = 83 - 86; B - = 80 - 82

C+ = 77 - 79; C = 73 - 76; C - = 70 - 72

D+ = 67 - 70; D = 63 - 66; D - = 60 - 62

F = 59 - 0

If the student ID does not exist, notify the user and repeat until a valid student ID or 'x' is entered.

You can assume the user will enter their name as it is stored in the array (i.e. you do not need to check for case). But if you're interested look up the .toLowerCase() string method to handle this scenario.

