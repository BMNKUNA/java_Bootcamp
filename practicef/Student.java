 class Student extends Person {
    int rollno =  30;
    
    void study() {
      System.out.println("I am studying");
    }
  
    public static void main(String args []) {
      Student obj = new Student();
      System.out.println("Name : "+obj.name+", age : "+obj.age+", rollno : "+obj.rollno);
      obj.talk();  
      obj.study();
    }  
 }