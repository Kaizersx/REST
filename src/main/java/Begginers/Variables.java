package Begginers;

public class Variables {

    int a, b, c; // declares three ints, a, b, and c.
    int d = 3, e, f = 5; // declares three more ints, initializing
    // d and f.
    byte z = 22; // initializes z.
    double pi = 3.14159; // declares an approximation of pi.
    char x = 'x'; // the variable x has the value 'x'.
}

/**
 * Instance Variables (Non-Static Fields)
 * Technically speaking, objects store their individual states in "non-static fields", that is,
 * fields declared without the static keyword. Non-static fields are also known as instance
 * variables because their values are unique to each instance of a class (to each object, in other words); the empName of one Employee is independent of the empName of another.
 * Each instance(objects) of a class has its own copy of instance variable.
 * Unlike a static variable, instance variables have their own separate copy of instance variable.
 * */

/**
 A class variable is any field declared with the static modifier; this tells the compiler that there is exactly one
 copy of this variable in existence, regardless of how many times the class has been instantiated.
 Consider these are 100 students in a college named "ABC", each student have their own unique roll
 number and name but the college remains the same among all the 100 students. The college field is declared as static so it can occupy memory only once.
 */