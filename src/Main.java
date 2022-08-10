import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String input = scanner.nextLine();
        List<Character> current = new ArrayList<>();
        List<Character> max = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (max.isEmpty()) {
                    current.add(input.charAt(j));
                    max.add(input.charAt(j));
                    continue;
                }
                if (input.charAt(j) < current.get(current.size() - 1)) {
                    current.clear();
                }
                current.add(input.charAt(j));
                if (current.size() > max.size()) {
                    max.clear();
                    max.addAll(current);
                }
            }
        }
        System.out.println(max);
    }
}