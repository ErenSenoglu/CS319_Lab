import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l4 = new ArrayList<>();

        l1.add(100);
        l1.add(500);
        l1.add(900);

        l2.add(800);
        l2.add(600);
        l2.add(300);

        l2.add(400);
        l2.add(700);
        l2.add(200);

        ArrayOrganizer organizer = new ArrayOrganizer();
        l4 = organizer.concatAndSort(l1,l2,l3);
        System.out.println("Result => "+l4);

        System.out.println("Successfully reverted in Git.");
    }

}
