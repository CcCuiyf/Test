public class level0 {
    public static void main (String []args){
        int sum = 0;
        for(int i=0;i<=50;i+=2) sum+=i;
        System.out.println(sum);
        int j=0,sum2=0;
        while(j<=50) {
            sum2+=j;
            j+=2;
        }
        System.out.println(sum2);
    }
}
