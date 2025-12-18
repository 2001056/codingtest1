import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            myList.add(i);

        }

        List<List<Integer>> doubleList = new ArrayList<>();
        boolean[] visitied = new boolean[myList.size()];
        permu(myList,n,doubleList,new ArrayList<>(),visitied);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < doubleList.size(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(doubleList.get(i).get(j));
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void permu(List<Integer> myList,int n, List<List<Integer>> doubleList,List<Integer> temp,boolean[] visitied){
        if (temp.size()==n) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if (visitied[i]) continue;
            visitied[i]= true;
            temp.add(myList.get(i));
            permu(myList,n,doubleList,temp,visitied);
            temp.remove(temp.size()-1);
            visitied[i] = false;

        }
    }
}
