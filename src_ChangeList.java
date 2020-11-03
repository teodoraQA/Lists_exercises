import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrNums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("end")) {
            String[] command = inputCommand.split("\\s+");
            switch (command[0]){
                case "Delete":
                    int numToDelete = Integer.parseInt(command[1]);
                    while (arrNums.contains(numToDelete)){
                        arrNums.remove(Integer.valueOf(numToDelete));
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    int num = Integer.parseInt(command[1]);
                    if (index < arrNums.size()){
                        arrNums.add(index, num);
                    }
                    break;
            }
            inputCommand = scanner.nextLine();
        }
        for (int n : arrNums) {
            System.out.print(n + " ");
        }
    }
}
