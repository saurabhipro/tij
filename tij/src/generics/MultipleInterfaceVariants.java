package generics;
// {CompileTimeError} (Won't compile)

interface Payable<T> {}

class Employee implements Payable<Employee1> {}
class Hourly extends Employee1
  implements Payable<Hourly> {} ///:~
