import java.util.Scanner;

public class Firast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Линейные программы
        System.out.println("Линейные программы");
        //1.1
        double a=6;
        double b=7, c=8;
        //a=in.nextInt();
        double z=((a-3)*b/2)+c;
        System.out.println(z);

        //1.2
        z=(((b+Math.pow((b*b+4*a*c),1/2)/(2*a))-(a*a*a*c)+1/(Math.pow(b,2))));
        System.out.println(z);

        //1.3
        double x=0.0;
        double y=45.0;
        double radians1 = Math.toRadians(x);
        double radians2 = Math.toRadians(y);
        z=((Math.sin(radians1)+Math.cos(radians2))/(Math.cos(radians1)-Math.sin(radians2))*Math.tan(radians2*radians1));
        System.out.println(z);

        //Ветвления
        System.out.println("\nВетвления");
        //2.1

        double corner1=2;
        double corner2=90;
        if(corner1+corner2<180) {
            System.out.println("Существует");
            if(corner1==90 || corner2 ==90){
                System.out.println("Прямоугольный");
            }
        }

        //2.2

        double d=9;
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));

        //2.3
        double x1=1, x2=1, x3=1;
        double y1=5, y2=8, y3=9;
        if(x1==x2 || x2==x3) {
            System.out.println("на одной");
        } else if(y1==y2 || y2==y3) {
            System.out.println("на одной");
        } else {
                System.out.println("не на одной");
            }

        //2.5

        
        //Циклы
        System.out.println("\nЦиклы");
        //3.1
        double w = 0;
        double q= 12;
        //q=in.nextInt();
        for(int i=1;i<q;i=i+1){
            w+=i;
        }
            System.out.println(w);


        //3.3
        for(int i=1;i<=100; i++){
            z+=Math.pow(i,2);
        }
        System.out.println(z);

        //3.4
        for(int i=1;i<=200; i++){
            z+=Math.pow(i,2);
        }
        System.out.println(z);

        //3.5
        double e=0.001;
        double n=7, sum=0;
        for(int i=1; i<=n;i++) {
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if(a > e)
            {
                sum+=a;
            }
        }
        System.out.println(sum);

        //3.6
        int a1=98;
        int c1= ~a1;
        System.out.println( a1 + " and " + c1);

        //3.7
        double m=0,  number=15;
        n=7;
        //m=in.nextInt();
        //n=in.nextInt();
        for(;m<=n;m++){
            if(number%m==0){
                System.out.println(m);
            }
        }

        //3.8
        /*double zz=20, xx=25;
        double aa=0, ss=0;
        while (zz>0){
            aa=zz%10;
            while (xx>0){
                ss=xx%10;
                if(ss==aa){
                    System.out.println(ss);
                }
            }
           // xx=15;
        }*/

        in.close();
    }
}
