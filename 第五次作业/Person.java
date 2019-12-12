public class Person {
    String name;
    int age;

    @Override
    public boolean equals(Object o){
        if(this.name==((Person) o).name && this.age==((Person) o).age)
            return true;
        else return false;
    }
    @Override
    public int hashCode(){
        int hash=0;
        StringBuilder str=new StringBuilder();
        str.append(name);
        str.append(age);
        char[] array=str.toString().toCharArray();
        for(char c:array) hash=hash*1133+c;
        return hash;
    }
    public Person(String name,int age){this.name=name;this.age=age;}

}

