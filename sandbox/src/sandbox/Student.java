package sandbox;

import java.util.ArrayList;

public class Student extends User {
  ArrayList courses = new ArrayList<Course>();

  public Student(String name, String email, String password, String type) {
    this.name = name;
    this.email = email;
    this.pw = password;
    this.type = type;
    this.id = generateRandomID();
  }

  //	this.isVerified = LibraryManager.verify(this);
  //    if (this.isVerified) {
  //        writeUserCsv(this.name, this.email, this.pw, this.id);
  //    } else {
  //        System.out.println("Student verification failed. User not added to CSV.");
  //    }

}
