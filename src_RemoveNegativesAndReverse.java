import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() ; i++) {
            if(numbers.get(i)< 0){
                numbers.remove(i);
                i--;
                }
            }// remove all negative numbers
        Collections.reverse(numbers);
        if(numbers.isEmpty()){
            System.out.println("empty");
        } else
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

        }
    }
