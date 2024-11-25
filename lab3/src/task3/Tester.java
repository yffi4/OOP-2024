package task3;

public class Tester {
    public static void main(String[] args) {
        MyCollection<String> mySet = new MySet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Apple");
        System.out.println("Set size: " + mySet.size());
        mySet.remove("Banana");
        System.out.println("Set contains Apple: " + mySet.contains("Apple"));

        MyCollection<String> myList = new MyList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Apple");
        System.out.println("List size: " + myList.size());
        myList.remove("Banana");
        System.out.println("List contains Banana: " + myList.contains("Banana")); 
    }
}

