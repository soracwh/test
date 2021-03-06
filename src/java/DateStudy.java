import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author Sora Chen
 * @Date 2022/3/11 9:23 下午
 * @Version 1.0
 */
public class DateStudy {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    private static SimpleDateFormat shortDateFormat = new SimpleDateFormat("hh:mm");
    public static void dateStudy1(){
        Date date = new Date();
        System.out.println(sdf.format(date));
        System.out.println(shortDateFormat.format(date));
    }
    public static void dateStudy2(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar));
    }

    public static void hello(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        dateStudy1();
    }

}

