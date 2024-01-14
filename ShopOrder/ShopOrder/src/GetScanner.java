public class GetScanner {

    public static Integer getIntScanner(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getStrScanner(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }
}
