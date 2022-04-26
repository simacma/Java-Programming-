package com.coreJava.DataTypes;

public class UserDefinedDatatype {
    public static class Student{
Student(){

}
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String name;
private int age;

    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(23);
        student.setName("Sima");
        System.out.println(student.getAge()+ "and " + student.getName());
    }
}
