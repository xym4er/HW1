package Var1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ChornyiUA on 21.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            list.add(new Double(scanner.nextDouble()));
        }

        double sum=0;

        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i).value;
        }
        int before=0;
        int after=0;

        for (int i = 0; i <list.size() ; i++) {
            before+=list.get(i).beforePoint();
            after+=list.get(i).afterPoint();
        }


        System.out.println(sum);
        System.out.println(before);
        System.out.println(after);
    }
}
