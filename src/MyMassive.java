import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyMassive {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int k = 0;
        int [] a  = new int [6];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++) {
            a[i]=s.nextInt();
            if(list.contains(a[i])==false) {
                list.add(a[i]);
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
            for(int j=i;j<a.length;j++) {
                if(list.get(i).equals(a[j]))
                    k+=1;

            } System.out.println("Число " +list.get(i) + " встречается " +k +" раз "); k=0;
        }
    }
}
