//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int row;
        int col;

        for (row = 1; row <= 5; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}