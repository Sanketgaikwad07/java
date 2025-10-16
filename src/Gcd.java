public class Gcd {
     static int gcd(int x,int y){
        if(x==0)
            return y;
            if(y==0)
            return x;
            if(x==y)
                return x;

if(x>y)
    return gcd(x-y,y);
return gcd(x,y-x);
        }

    public static void main(String[] args) {
        int x=1000, y=12;
        System.out.println("GCD  "+x+"  of other values is  "  +y+"is " +gcd(x,y));
    }
    }

