
public class main {
    public static void main(String[] args) {

        int n=30000;

        if(n>10000 && n<20000){
            n=n+2000;
        }
        else if(n>20000)
        {
            n+=3000;
        }
        else{
            n+=1000;
        }
        System.out.println(n);
    }
    
}
