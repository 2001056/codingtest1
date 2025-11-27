import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZoneId seoul = ZoneId.of("Asia/Seoul");
        
        LocalDate today = LocalDate.now(seoul);
        
        System.out.println(today);
    }
}
