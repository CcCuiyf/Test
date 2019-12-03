package level1;
import java.util.*;

public class level1 {
    public static void main(String args[]){
        value stu=new value();
        Scanner scan=new Scanner(System.in);
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        stu.setAge(scan.nextInt());
        System.out.println(stu.getAge());
        stu.setName(scan.next());
        System.out.println(stu.getName());
    }

}
