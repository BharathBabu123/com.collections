package collections;
public class Student {
      String name;
      int age;
      String id;
      int number;
      
      public void student (String name) {
        this.name = name;
      }
      
      public void studentAge(int stuAge) {
    	  age = stuAge;
      }
      
      public void StudentId(String stuId) {
    	  id = stuId;
      }
      public void studentNum(int stuNum) {
    	  number = stuNum;
      }
      
      
      
      
    public void printStudent() {
    	System.out.println("Name:" +name);
    	System.out.println("Age" +age);
    	System.out.println("id" +id);
    	System.out.println("Number" +number);
    	
    }
}
