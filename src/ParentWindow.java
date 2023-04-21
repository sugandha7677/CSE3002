// 
//public class SingletonDemo2{
//	
//	public static void main(String[] args) {
//		//ParentWindow window =new ParentWindow();
//		ParentWindow.win;
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//class ParentWindow {
//   
//	static ParentWindow win;
//	
//   private ParentWindow(){
//	    win=new ParentWindow();
//	    return win;
// }
//	
//
//}

//
// class Sample{
//   public static void main(String[] args)
//   {
//       int a[] = {1,2,3,4};
//       System.out.print(a instanceOf Object);
//   }
// }

class Person
{
   Person(String s, int i) 
   {
       ++pid;
       name = s;
       age = i;
    }
     static int pid;
     int age;
     String name;
}

class Test
{
      public static void main(String[] args)
      {
            Person p1 = new Person("John", 22);
            Test te = new Test();
            Person p2 = te.change(p1);
            System.out.print(Person.pid + " "+p2.name+ " " + p2.age);
            System.out.print(Person.pid + " "+ p1.name+" " + p1.age);
     }

	      private Person change(Object o)
     {
            Person p2 = (Person) o;
            p2.age = 25;
            return p2;
      }
}