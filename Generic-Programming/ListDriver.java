public class ListDriver{

public static void main(String[] args){

List<String> gList = new List<String>(10);  // groceries list
gList.add("Bread");
gList.add("Milk");
gList.add("Banana");
gList.add("Rice");

System.out.println(gList);

List<Integer> nList = new List<Integer>(25);  // numbers list
nList.add(10);
nList.add(345);
nList.add(56);
nList.add(734);
nList.add(5432);

System.out.println(nList);

}

}
