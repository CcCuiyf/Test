package level2;

public class level2 {
    public static void main(String args[]){
     Pet d = new dog();
     Pet c = new cat();
     Pet r = new rabbit();
     show(new dog());
     c.asApet();
     r.asApet();
    }
    public static void show(Pet a){
        if(a instanceof dog){
            dog c=(dog)a;
            c.kind();
        }
        a.asApet();
    }
}
