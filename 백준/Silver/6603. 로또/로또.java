import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()){
            int a = sc.nextInt();
            if (a==0) break;

            List<Integer> myList = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                int n = sc.nextInt();
                myList.add(n);

            }
            List<List<Integer>> doubleList = new ArrayList<>();
            combi(myList,0,6,doubleList,new ArrayList<>());

            for (List<Integer> list : doubleList) {
                for (Integer num : list){
                    sb.append(num+ " ");
                }
                sb.append("\n");
            }sb.append("\n");

        }System.out.println(sb);




    }
    public static void combi(List<Integer> myList,int start,int n, List<List<Integer>> doubleList,List<Integer> temp){
    if (temp.size()==n) {
        doubleList.add(new ArrayList<>(temp));
        return;
    }
    for (int i = start; i < myList.size(); i++) {
        temp.add(myList.get(i));
        combi(myList,i+1,n,doubleList,temp);
        temp.remove(temp.size()-1);

    }
}
}
