package Task_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, List<String>> emplHolder = new HashMap<String, List<String>>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();

            if ("list".equals(line)){
                System.out.println(emplHolder);
                break;
            }

            String[] splitArray = line.split(" ");
            String name = splitArray[0];
            String dzial = splitArray[1];

            if (emplHolder.containsKey(dzial)) {
                emplHolder.get(dzial).add(name);
            } else {
                List <String> newList = new ArrayList<>();
                newList.add(name);
                emplHolder.put(dzial, newList);
            }

        }

    }

}
