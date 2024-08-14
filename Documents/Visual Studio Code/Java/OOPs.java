/* 

public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("Yellow");
        p1.color="Yellow";
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}

*/


/*

Getters and Setters



public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
*/

/*

 Types of constructor



public class OOPs {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s1 = new Student("Shradha");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name = name;
    }
}
*/


/* 


Shallow and Deep copy constructor



public class OOPs{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shradha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor - marks will change
    //Student(Student s1){
       // marks = new int[3];
       // this.name = s1.name;
       // this.roll = s1.roll;
       // this.marks = s1.marks;
   // }

    //deep copy constructor - marks won't change

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}

*/

/*   

Single level inheritance 


public class OOPs{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        
    }
}

class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}

*/

/*

Multilevel Inheritance 


public class OOPs{
    public static void main(String[] args) {
        Dog shihtzu = new Dog();
        shihtzu.eat();
        shihtzu.legs = 4;
        System.out.println(shihtzu.legs);
    }
}

class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

*/

/* 


Hierarchial Inheritance 


public class OOPs{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Mammal dog = new Mammal();
        dog.breathe();
    }
}

class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


*/

/*


Hybrid Inheritance



public class OOPs{
    public static void main(String[] args) {
        Dog labra = new Dog();
        labra.eat();
        Shark dorthy = new Shark();
        dorthy.swim();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Tuna extends Fish{
    void tribe(){
        System.out.println("Thunnini tribe");
    }
}

class Shark extends Fish{
    void fact(){
        System.out.println("Sharks don't have bones");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("can fly");
    }
}

class Peacock extends Bird{
    void dance(){
        System.out.println("dances during rain");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("barks");
    }
}

class Cat extends Mammal{
    void wool(){
        System.out.println("plays with wool");
    }
}

class Human extends Mammal{
    void speak(){
        System.out.println("speaks");
    }
}

*/


/*


Method overloading

public class OOPs{
    public static void main(String[] args) {
    Calculator cal = new Calculator();
    System.out.println(cal.sum(2, 3));
    System.out.println(cal.sum((float)2.5, (float)3.7));   
    System.out.println(cal.sum(4, 1, 8));    
    }
}

class Calculator{
    int sum(int a, int b){
        return (a+b);
    }
    float sum(float a, float b){
        return (a+b);
    }
    int sum(int a, int b, int c){
        return (a+b+c);
    }
}

*/

/*


Method Overriding



public class OOPs{
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

*/


/*
 
Abstraction

public class OOPs{
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}



public class OOPs{
    public static void main(String args[]){
        Mustang m = new Mustang();  
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

*/

/*



Interfaces


public class OOPs{
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right)");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}

*/

/*



Multiple Inheritance using Interface


public class OOPs {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.hunt();
    }
}

interface Herbivore{
    void eat();
}
interface Carnivore{
    void hunt();
}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Bear feeds on both plants and animals.");
    }
    public void hunt(){
        System.out.println("Bear hunts fish, deer and moose the most ");
    }
}

*/

/*


Static Property



public class OOPs{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JMV";
        Student s3 = new Student();
        s3.schoolName = "Abc";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}




Static Function


public class OOPs{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JMV";
        Student s3 = new Student();
        s3.schoolName = "Abc";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.returnPerct(90, 85, 75));
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    static int returnPerct(int math, int phy, int chem){
        return (math+phy+chem)/3 ;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}

*/

/*



Super keyword

public class OOPs{
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}


*/


//Assignment questions

public class OOPs {

    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(3, 4);
        Complex e = Complex.add(c, d);
        Complex f = Complex.difference(c, d);
        Complex g = Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}

class Complex{
    int real;
    int imag;

    public Complex(int r, int i){
        this.real = r;
        this.imag = i;
    }
    
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real),(a.imag + b.imag));
    }

    public static Complex difference(Complex a, Complex b){
        return new Complex((a.real - b.real),(a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex((a.real * b.real),(a.imag * b.imag));
    }

    public void printComplex(){
        System.out.println(real+ "+" +imag+ "i");
    }
    
}
