

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
  //array to hold student names
  ArrayList<String> roster = new ArrayList<>();
    roster.add("Amy");
    roster.add("Bill");
    roster.add("Colin");
    roster.add("Danni");
    roster.add("Emma");
    roster.add("Figus");
    roster.add("George");
    roster.add("Hannah");
    roster.add("Imogene");
    roster.add("Kyle");

  //array to hole student grades; must be same length as student roser
  ArrayList<Integer> grades = new ArrayList<>();
    grades.add(81);
    grades.add(86);
    grades.add(92);
    grades.add(99);
    grades.add(90);
    grades.add(83);
    grades.add(89);
    grades.add(83);
    grades.add(79);
    grades.add(97);

  Scanner scan = new Scanner(System.in);
  //while(true) loop to take student name as input (case-insensitive) and output student ID, or return error message and ask for output again
    while(true) {
    System.out.print("Enter Student Name (or 'x' to exit): ");
    String name = scan.nextLine();
      if (name.equals("x")) {
        break;
      }

      int index = -1;
      for (int i = 0; i < roster.size(); i++) {
          if (roster.get(i).equalsIgnoreCase(name)) { 
              index = i;
              break; 
          }
          }
      
      if (index != -1) {
        System.out.println();
        System.out.println("Your Student ID is: " + index);
        System.out.println();
        break;
      }
      
    else {
      System.out.println();
      System.out.println("Student not found.  Please try again.");
      System.out.println();
    }
  }

  //while(true) loop to take student ID as input and output a letter grade based on predefined ranges  
    while(true) {
    System.out.print("Enter Student ID to see grade (or 'x' to exit): ");
    String studentID = scan.nextLine();
      if (studentID.equals("x")) {
        break;
      }
//there should be some kind of exception handling language here, but that's a bit beyond me at the moment.  A good little future project!
      Integer studentNUM = Integer.valueOf(studentID); 
      String letter = "";
      if (studentNUM != null && studentNUM >= 0 && studentNUM < roster.size()) {
        int grade = grades.get(studentNUM); //studentID comes from roster,  but can use derivative studentNUM here because the arrays are the same length
        if (grade >= 93) {
          letter = "A";
        } else if (grade >= 90) {
          letter = "A-";
        } else if (grade >= 87) {
          letter = "B+";
        } else if (grade >= 83) {
          letter = "B";
        } else if (grade >= 80) {
          letter = "B-";
        } else if (grade >= 77) {
          letter = "C+";
        } else if (grade >= 73) {
          letter = "C";
        } else if (grade >= 70) {
          letter = "C-";
        } else if (grade >= 67) {
          letter = "D+";
        } else if (grade >= 63) {
          letter = "D";
        } else if (grade >= 60) {
          letter = "D-";
        } else if (grade < 60) {
          letter = "F";
        }
      
        System.out.println();
        System.out.println("Your Grade: " + letter);
        break;
      } else {
        System.out.println();  
        System.out.println("Invalid Student ID. Please try again.");
        System.out.println();
      }
      
    }
    
      
    
  }

  
}