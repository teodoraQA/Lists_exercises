import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");

            switch (commandElements[0]) {
                case "Contains":
                    if (numbers.contains(Integer.valueOf(commandElements[1]))) {
                        System.out.println("Yes");
                    } else
                        System.out.println("No such number");
                    break;
                case "Print":
                    switch (commandElements[1]) {
                        case "even":
                            String outputEven = "";
                            for (int printEvenNum : numbers) {
                                if (printEvenNum % 2 == 0) outputEven+=printEvenNum+ " ";
                            }
                            System.out.println(outputEven);
                         break;
                        case "odd":
                            String outputOdd = "";
                            for (int printOddNum : numbers) {
                                if (printOddNum % 2 != 0) outputOdd += printOddNum + " ";
                            }
                            System.out.println(outputOdd);
                        break;
                    }
                    break;
                case "Get":
                    int sumAllNums= 0;
                    for (int nums : numbers) {
                        sumAllNums += nums;
                    }
                    System.out.println(sumAllNums);
                    break;
                case "Filter":
                    String output = "";
                    switch(commandElements[1]){
                        case ">":
                            for (int nums : numbers) {
                                if( nums > Integer.parseInt(commandElements[2])){
                                    output+= nums + " ";
                                }
                            }
                            System.out.println(output);
                            break;
                        case"<":
                            for (int nums : numbers) {
                                if( nums < Integer.parseInt(commandElements[2])){
                                    output+= nums + " ";
                                }
                            }
                            System.out.println(output);
                            break;
                        case ">=":
                            for (int nums : numbers) {
                                if( nums >= Integer.parseInt(commandElements[2])){
                                    output+= nums + " ";
                                }
                            }
                            System.out.println(output);
                            break;
                        case "<=":
                            for (int nums : numbers) {
                                if( nums <= Integer.parseInt(commandElements[2])){
                                    output+= nums + " ";
                                }
                            }
                            System.out.println(output);
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

    }
}
