/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

/*
Commit4_1.1. Zmodyfikuj plik Main tak, aby można było z konsoli dodawać nowego studenta

Commit4_1.2. Zmodyfikuj plik Main tak, aby można było na żądanie wypisać wszystkich studentów z bazy

Commit4_1.3. Zmodyfikuj plik Main i Student tak, aby można było z konsoli dodawać nowego studenta z innymi danymi

javac -d . src/main/java/Main.java src/main/java/Service.java src/main/java/Student.java && java -cp . Main
*/
import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Podaj imie");
    String name = scanner.nextLine();
    System.out.println("Podaj wiek");
    int age = scanner.nextInt();
    try {
      Service s = new Service();
      s.addStudent(new Student(name, age));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
}