import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reg = "\\（.*?\\）";
        System.out.println(s.replace("，","、").replace("。","").replace("g ","g、"));

    }
}
