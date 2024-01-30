package com.mjv.exercicios.Model;
public class User {
  private String name;
  private String occupation;
  private int age;

  public User(){}

  public User(String name, String occupation, int age) {
    this.name = name;
    this.occupation = occupation;
    this.age = age;
  }

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getOccupation() {
    return occupation;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", occupation='" + occupation + '\'' +
        ", age=" + age +
        '}';
  }
}
