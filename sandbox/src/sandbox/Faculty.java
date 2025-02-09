package sandbox;

import java.util.ArrayList;

public class Faculty extends User {
  ArrayList courses = new ArrayList<Course>();

  public Faculty(String name, String email, String password, String type) {
    this.name = name;
    this.email = email;
    this.pw = password;
    this.type = type;
    this.id = generateRandomID();
  }

  public Faculty(String name, String email, String password, String type, String id) {
    this.name = name;
    this.email = email;
    this.pw = password;
    this.type = type;
    this.id = id;
  }
}
