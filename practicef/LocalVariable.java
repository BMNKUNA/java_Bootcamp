 class LocalVariable {
   public LocalVariable()   {
     int b = 30; // local variable b, created inside block
     System.out.println("b = "+b);
   } 
  {

      double e = 11;
      System.out.println("e = "+e);
     int a = 10; // local variable a, created inside constructor
     System.out.println("a = "+a);
   }
  
   public static void main(String [] args) {
     int c = 20; // local variable c, created inside method     
     System.out.println("c = "+c);
     // Constructor and block will be executed by below line
     LocalVariable lv = new LocalVariable();

     int d = 40; // local variable d, created inside method
     // Below code will throw error if uncommented, as d is not initialized.
     System.out.println("d = "+d);     
   } 
 }