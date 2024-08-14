
// class Animal {
//   constructor(name, legCount) {
//     this.name = name
//     this.legCount = legCount
//   }
//   describe() {
//     return `${this.name} has ${this.legCount} legs`
//   }
// }
class Animal{
  constructor(name, legCount, speaks){
    this.name = name;
    this.legCount = legCount;
    this.speaks = speaks;
  }
  static myType(){
    console.log("Animal")
  }
  print() {
      console.log(this.name + " has " + this.legCount + " legs" + " and says " + this.speaks)
  }
}
let dog = new Animal("dog", 4, "woof");//create object
dog.print();// call function
let cat = new Animal("cat", 4, "meow");
cat.print();
console.log(Animal.myType())
// cat.myType(); error
// console.log(Animal.print()); error


