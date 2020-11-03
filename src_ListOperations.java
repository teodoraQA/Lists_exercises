import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();
        int rotations = 0;
        while (!inputCommand.equals("End")) {
            String[] command = inputCommand.split("\\s+");
            switch (command[0]) {
                case "Add":
                    arrList.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    int num = Integer.parseInt(command[1]);
                    if (index < arrList.size() && index >=0 ) {
                        arrList.add(index, num);
                    }
                    else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(command[1]);
                    if (removeIndex <= arrList.size() - 1 && removeIndex >=0) {
                        arrList.remove(removeIndex);
                    }
                    else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    rotations = Integer.parseInt(command[2]);
                    if (command[1].equals("left")) {
                        for (int i = 1; i <= rotations % arrList.size(); i++) {
                            int buffer = arrList.get(0);
                            for (int j = 0; j < arrList.size() - 1; j++) {
                                arrList.set(j, arrList.get(j + 1));
                            }
                            arrList.set(arrList.size() - 1, buffer);
                        }
                    } else {
                        if (command[1].equals("right")) {
                            for (int i = 1; i <= rotations % arrList.size(); i++) {
                                int buffer = arrList.get(arrList.size() - 1);
                                for (int j = arrList.size() - 1; j > 0; j--) {
                                    arrList.set(j, arrList.get(j - 1));
                                }
                                arrList.set(0, buffer);
                            }
                        }
                        break;
                    }
            }// switch
            inputCommand = scanner.nextLine();
        }// while
        for (int n : arrList) {
            System.out.print(n + " ");
        }
    }
}