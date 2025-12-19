import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<String> myList = new ArrayList<>();
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String M = sc.nextLine();
            myList.add(M);
        }
        myList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }else
                    return o1.length()-o2.length();

            }
        });
        Set<String> mySet = new LinkedHashSet<>();
        for (String a : myList){
            mySet.add(a);
        }
            for (String b : mySet) {
                    sb.append(b);
                    sb.append("\n");
                }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
            }

        }






