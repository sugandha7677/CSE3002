
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;



public class ArrayListDemo {



public static void main(String[] args) {
List<String> aList = new ArrayList<>(5);
ArrayList<String> anotherList = new ArrayList<>(10);

aList.add("Apple");
aList.add("Pineapple");
aList.add("Grape");

System.out.println(aList);

anotherList.addAll(aList);

Iterator<String> iter = anotherList.iterator();
while(iter.hasNext())
System.out.println(iter.next());

if(anotherList.contains("Banana"))
{
int i = anotherList.indexOf("Banana");
anotherList.set(i, "Guava");
}
anotherList.add("Banana");

System.out.println(anotherList);
Collections.sort(anotherList);
System.out.println("After sorting: ");
System.out.println(anotherList);

for(int i=0;i<anotherList.size();i++)
System.out.print(anotherList.get(i)+ " ");
}
}