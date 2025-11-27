import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" "); // 공백을 기준으로 배열을 자른다
        double first = Double.parseDouble(arr[0]); // 0번째 배열의 문자를 숫자로 변환 > first에 저장
        double second = Double.parseDouble(arr[1]); // 1번째 배열의 문자를 숫자로 변환 > second저장
        System.out.println(first/second);

    }
}