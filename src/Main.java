import com.test.User;

import java.util.Date;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        method();
        System.out.println("改动");
    }

    //zheshi 注释

    public static void method() {
        String s = "na";
        Date ss = new Date();
        Date date1 = new Date();
        Thread thread = Thread.currentThread();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //region Description
        System.out.println(thread.getName());
        //endregion
        User user = new User();
        user.setAge(22);
    }
}
