//introfuction to Chapter 4

We have 3 different control structures

1. Sequence Structure
2. Selection Statements

2.1 if statement - single -selelction Statemen
2.2 if .. else statement - double selelction statement
2.3 switch - multiple selection statement

3. iteration statement
3.1 while
3.2 for
3.3 do ... while

2.1 single-selection statement

//pseudocode

if student's grade is less than 60
then print "F"

if(studnetsGrade <60){
  System.out.print("F");
}


//

2.2. if ...else Statements

if student's grade is greater than or equal to 60
then print "passed"
else
  then print "failed"



if (studnetsGrade >= 60){
  System.out.print("passed");
}
else {
  System.out.print ("failed");
}


nested if...else statements
//pseudocode

if student's grade is freater than or equal to 90
then print "A"

else
  if student's grade is greater than or equal to 80
  then print "B"

else
  if students grade is greater than or equal to 70
  the print "c"

else
  if students grade is greater than or equal to 60
  then print "D"

else
  print "F"
  ////////// actual code below

if (studenGrade >=90){
  System.out.print ("A");}

else {
  if(studenGrade >= 80) {
    System.out.print ("B"); }

  else {
    if (studenGrade >= 70);
    System.out.print("C");}

    else{
      if (studenGrade>=60);{
        System.out.print("D");}

      else {
        System.out.print("F");}
        }
      }
    }
}

// second option for nested if .... else statements

if (studentsGrade >=90){
  System.out.print ("A");}

else if (studentsGrade >=80){
  System.out.print("B");}

else if (studentsGrade >= 70) {
  System.out.print("C");}

else if (studentsGrade >= 60){
  System.out.print("d");
}
else{
  System.out.print("F");
}

// missing info


//conditional operator
// you are first writing the conditional statement then the outputs
system.out.print(studentsGrade >= 60 ? "Passed": "Failed");
