import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> peopleInWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxWagonCapacity = Integer.parseInt(scanner.nextLine());
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("end")) {
            String[] command = inputCommand.split(" ");
            if (command.length == 1) {
                int peopleToInsert = Integer.parseInt(command[0]);
                for (int i = 0; i < peopleInWagons.size(); i++) {
                    if (peopleInWagons.get(i) + peopleToInsert <= maxWagonCapacity) {
                        int insert = peopleInWagons.get(i) + peopleToInsert;
                        peopleInWagons.set(i, insert);
                        break;
                    }
                }
            } else {
                int wagon = Integer.parseInt(command[1]);
                peopleInWagons.add(wagon);
            }
            inputCommand = scanner.nextLine();
        }
        print(peopleInWagons);
    }

    public static void print(List<Integer> peopleInWagons) {
        for (int peoples : peopleInWagons) {
            System.out.print(peoples + " ");
        }
    }
}
