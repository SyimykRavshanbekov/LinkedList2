import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(i, random.nextInt(2));
            linkedList.add(i, random.nextInt(2));
        }

        System.out.println("ArrayList: " +  Arrays.toString(array));
        sort(array);
        System.out.println("\nLinkedList: " +  linkedList);
        sort(linkedList);
        System.out.println("\nArrayList: " +  arrayList);
        sort(arrayList);
    }

    static void sort(int array[]){
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    static void sort(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);
    }

    static void sort(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println("Sorted LinkedList: " + arrayList);
    }
}