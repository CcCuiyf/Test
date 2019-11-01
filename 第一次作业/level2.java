public class level2 {
    public static void main(String args[]){
        //int flag1=0,flag2=0,flag=0;
        String str=new String();
        char[] ch=new char[50];
        str="acbdw,12695,47AasIDX";
        //String str1,str2,str3;
        //flag=str.indexOf(',');
        //str1=str.substring(1,flag);
        String s[]=str.split(",",3);
        System.out.println(s[0]+' '+s[1]+' '+s[2]);
        for(int i=0;i<3;++i) {
            judge1(s[i]);
            judge2(s[i]);
            judge3(s[i]);

        }
    }
    public static void judge1(String  a){
        int flag1=0,flag2=0;
        for (char c = 1; c <= 127; ++c) {
            if ((c >= '0') && (c <= '9')) continue;
            else if (a.indexOf(c) != -1) {
                flag1 = 1;
                if ((c >= 'A') && (c <= 'Z')) flag2 = 1;
            }
        }
        if (flag1 == 1) System.out.println("This String does not consist by only numbers");
        if (flag2 == 1) System.out.println("This String have capital letter");
        flag1 = 0;
        flag2 = 0;//判断是否全数字及是否含有大写字母
    }
    public static void judge2(String a){
        for (char c = 'A'; c <= 'z'; c++)
            if (((c <'Z') || (c > 'a')) && ((a.indexOf(c) != -1))) {
                System.out.println(a.toUpperCase());
                break;
            }//判断是否有字母及转换为大写
    }
    public static void judge3(String a){
        int flag=0;
        for (char c = 1; c <= 127; ++c)
            if (((c < 'A') || ((c > 'Z') && (c < 'a')) || (c > 'z')) && (a.indexOf(c) != -1)){
                flag=1;
                break;
            }//如果有非字母就break;
        if(flag==0){
            char[] ch=new char[50];
            ch = a.toCharArray();
            for (int j = 0; j < a.length(); ++j)
                for (int k = a.length() - 1; k > j; k--) {
                    if (ch[j] > ch[k]) {
                        char temp;
                        temp = ch[j];
                        ch[j] = ch[k];
                        ch[k] = temp;
                    }
                }//冒泡
            for (int j = 0; j < a.length(); ++j) System.out.print(ch[j]);
            System.out.println(' ');//输出
            flag=0;
        }//判断是否全为字母及排序输出
    }
}
