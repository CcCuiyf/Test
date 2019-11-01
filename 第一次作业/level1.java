public class level1 {
    public static void main(String args[]){
        int flag1=0,flag2=0,flag=0;
        String str=new String();
        char[] ch=new char[50];
        str="acbdw,12695,47AasIDX";
        //String str1,str2,str3;
        //flag=str.indexOf(',');
        //str1=str.substring(1,flag);
        String s[]=str.split(",",3);
        System.out.println(s[0]+' '+s[1]+' '+s[2]);
        for(int i=0;i<3;++i) {
            for (char c = 1; c <= 127; ++c) {
                if ((c >= '0') && (c <= '9')) continue;
                else if (s[i].indexOf(c) != -1) {
                    flag1 = 1;
                    if ((c >= 'A') && (c <= 'Z')) flag2 = 1;
                }
            }
            if (flag1 == 1) System.out.println("String s[" + i + "] does not consist by only numbers");
            if (flag2 == 1) System.out.println("String s[" + i + "] have capital letter");
            flag1 = 0;
            flag2 = 0;//判断是否全数字及是否含有大写字母

            for (char c = 'A'; c <= 'z'; c++)
                if (((c <'Z') || (c > 'a')) && ((s[i].indexOf(c) != -1))) {
                    System.out.println(s[i].toUpperCase());
                    break;
                }//判断是否有字母及转换为大写

            for (char c = 1; c <= 127; ++c)
                if (((c < 'A') || ((c > 'Z') && (c < 'a')) || (c > 'z')) && (s[i].indexOf(c) != -1)){
                    flag=1;
                    break;
                }//如果有非字母就break;
            if(flag==0){
                ch = s[i].toCharArray();
                for (int j = 0; j < s[i].length(); ++j)
                    for (int k = s[i].length() - 1; k > j; k--) {
                        if (ch[j] > ch[k]) {
                            char temp;
                            temp = ch[j];
                            ch[j] = ch[k];
                            ch[k] = temp;
                        }
                    }//冒泡
                for (int j = 0; j < s[i].length(); ++j) System.out.print(ch[j]);
                System.out.println(' ');//输出
                flag=0;
            }//判断是否全为字母及排序输出

            }
        }
    }

