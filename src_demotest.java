import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demotest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        while(true){
            String command = scanner.nextLine();
            if(command.equals("end")) {
                break;
            }
            String[] commandElements= command.split(" ");

            switch(commandElements[0]){
                case "Add":
                    int numAdd = Integer.parseInt(commandElements[1]);
                    numbers.add(numAdd);
                    break;
                case "Remove":
                    int numRemove =Integer.parseInt(commandElements[1]);
                    numbers.remove(Integer.valueOf(numRemove));
                    break;
                case "RemoveAt":
                    int index= Integer.parseInt(commandElements[1]);
                    numbers.remove(index);
                    break;
                case "Insert":
                    int position= Integer.parseInt(commandElements[2]);
                    int numInsert = Integer.parseInt(commandElements[1]);
                    numbers.add(position,numInsert);
                    break;

            }

        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}

