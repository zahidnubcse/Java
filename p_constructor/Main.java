class Student {
  String name;
  int id;

public Student (String name, int id){
  this.name = name;
  this.id = id;
}

void display () {
  System.out.println("Name: "+name + "\n id: "+id);
}
}

public class Main{
  public static void main(String[] args) {
      Student sdt1 = new Student("Zahid", 20);
      Student sdt2 = new Student("Hasan", 30);

    sdt1.display();
    sdt2.display();

  }
}