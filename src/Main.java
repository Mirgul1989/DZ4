import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите 5 имен коллекция A");
            Scanner scanner = new Scanner(System.in);
            String A = scanner.nextLine();
            listA.add(A);
        }
        System.out.println(listA);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите 5 имен коллекция B");
            Scanner scanner = new Scanner(System.in);
            String B = scanner.nextLine();
            listB.add(B);

        }
        System.out.println(listB);
        {
            System.out.println("Введите 10 имен коллекция С");

            Integer X = 0;

            while (listC.size() < listA.size() + listB.size()) {
                listC.add(listA.get(X));
                listC.add(listB.get(X));
                X++;
            }

            System.out.println(listC);
            listC.add(listA.get(0));
            listC.add(listB.get(1));


            Collections.sort(listC, new Comparator<String>() {
                @Override
                public int compare(String G1, String G2) {
                    return G1.length() - G2.length();
                }
            });

            System.out.println(listC);
        }
    }
}