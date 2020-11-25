# RTS-labs-exercise
Exercise problems by RTS labs

#1  Print the number of integers in an array that are above the given input and the number that are below, e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.

#2  Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g. “MyString” rotated by 2 is “ngMyStri”.

#3  If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?
 - Since I have worked more on Java I would like to share my thoughts on that,
 - One thing that I would like to mention is the concept of Object cloning in Java. There are 3 different ways to create copy of objects - Shallow copy, deep copy and cloning.
 - I would like to give an example to explain cloning in Java.
 **Example:** 
 ```java
 class Cloning{
  public static void main(String[] args) throws CloneNotSupportedException {
    A obj = new A();
    obj.i = 5;
    obj.j = 6;
    A obj1 = (A)obj.clone();
  }
 }
 
 class A implements Cloneable{
  int i;
  int j;
  
  @Override
  public Object clone() throws CloneNotSupportedException{
    return super.clone()
  }
 }
 ```
 - In Java every class extends an object by default, and going into this library we can understand that the clone() method is protected. So, I won't be able to directly use this method (*protected native Object clone() throws CloneNotSupportedException*).
 - I need to follow few steps to use this clone() method. Firstly, I need to override the clone() method inside a class and make it public (line 26) and I need to make sure I call the super class to complete the override process. Secondly, Java by default won't allow the instance to make use of clone() method directly even after overriding, so I need to implement the Cloneable interface. This interface is basically a marker interface which is used for permissions.
 - All these steps makes it really hard to clone an object. So, ***one change*** I would like to make here is to add a standard interface with a method to return the copy of the object. All the classes in the library (ArrayList, HashMap, HashSet) should implement this interface. It would be more easy to understand and implement the concept of cloning.
