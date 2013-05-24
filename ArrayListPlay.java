/* A simple program to demonstrate the functionality of ArrayList */
import java.util.*;

public class ArrayListPlay{

public static void main(String[] args){

ArrayList<String> names = new ArrayList<String>(15);

names.add("Sachin");
names.add("Clarke");
names.add("Dhoni");
names.add("DeVillers");
names.add("Hussey");
names.add("Kallis");
names.add("Pieterson");
names.add("Pollard");
names.add("Gambhir");
names.add("Sehwag");
names.add("Raina");
names.add("Kohli");
names.add("McCullum");
names.add("Amla");
names.add("Gilchrist");
names.add("Jayawardane");
names.add("Gayle");
names.add("Sangakkara");


for(String name: names){
System.out.println(name);
}

}

}
