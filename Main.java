import java.util.Scanner;
import java.io.*;

class Main{
    public static void main(String args[]){
        Mars mars = new Mars();
        String line;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print(mars.getX() + " " + mars.getY() + " " + mars.getDir() + "\n");
            System.out.print("> ");
            line = scanner.nextLine();
            mars.evalLine(line);
        }
    }
}
