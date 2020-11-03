import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsQty = Integer.parseInt(scanner.nextLine());
        ArrayList<String> guests = new ArrayList<String>();
        for (int i = 1; i <= commandsQty; i++) {
            String command = scanner.nextLine();
            String[] splitCommand = command.split("\\s+", 2);
            if (splitCommand[1].equals("is going!")) {
                if (!guests.contains(splitCommand[0])) {
                    guests.add(splitCommand[0]);
                } else {
                    System.out.printf("%s is already in the list!%n", splitCommand[0]);
                }
            } else {
                if (guests.contains(splitCommand[0])) {
                    guests.remove(splitCommand[0]);
                } else{
                    System.out.printf("%s is not in the list!%n", splitCommand[0]);
                }
            }
        }// for

        for (String guest: guests) {
            System.out.println(guest);
        }

    }
}
