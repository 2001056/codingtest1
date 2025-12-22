import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> mq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) - Math.abs(o2)==0){
                    return o1-o2;
                }else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.nextLine());
            if (a != 0){
                mq.add(a);
            }else {
                if (mq.isEmpty()) {
                    sb.append(0);
                    sb.append("\n");
                }else {
                    sb.append(mq.poll());
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);

            }

        }






