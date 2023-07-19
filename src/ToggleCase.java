import java.util.Scanner;
public class ToggleCase {

    public static char[] toggleCase(String s){
        char array[]=s.toCharArray();
        for(int i=0;i<array.length;i++){
            array[i] ^= 32;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string =scanner.nextLine();
        char array[]=toggleCase(string);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

}