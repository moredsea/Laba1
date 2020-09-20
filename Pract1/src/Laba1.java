import java.util.Random;
import java.util.Scanner;

public class Laba1 {
        int[] arr = {4, 9, 7, 2, 3, 9, 8, 6, 11, 5};
        int sum;
        void a(){
            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + arr[i];
            }
            System.out.println("\"For\" cycle: "+sum);
            System.out.println("-------------------------------");
        }
        void b(){
            int i=0;
            this.sum=0;
            while(i<10)
            {
                sum+=arr[i];
                i++;
            }
            System.out.println("\"While\" cycle: "+sum);
            System.out.println("-------------------------------");
        }
        void c(){
            this.sum=0;
            int i=9;
            do{
                sum+=arr[i];
                i--;}
            while(i>-1);
            System.out.println("\"Do While\" cycle: "+this.sum);
            System.out.println("-------------------------------");
        }
        double[] sort(double[] a)
        {
            double[] b=a;
            double lenght = a.length;
            double temp;
            for(int i=0;i<lenght;i++)
            {
                for(int j=0;j<lenght-1;j++)
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            return b;
        }
        void random1() {
            double[] arr;
            arr = new double[12];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ((int) (Math.random() * 12));
                System.out.println("random: "+(int)arr[i]);
            }

            double[] arrs=new double[12];
            arrs=sort(arr);
            for(int i=0;i<arrs.length;i++)
            {
                System.out.println("sorted: "+(int)arrs[i]);
            }
        }
        void random2(){
            double arrr[]=new double[10];
            double arrs[]=new double[10];
            Random rand = new Random();
            for(int i=0;i<10;i++)
            {
                arrr[i]= rand.nextDouble()*24;
                System.out.println("Random2: "+(int)arrr[i]);
            }
            arrs=sort(arrr);
            for(int i=0;i<10;i++)
            {
                System.out.println("Sorted2: "+(int)arrs[i]);
            }
            System.out.println("-------------------------------");
        }
        void factorial(){
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();////????
            int fact=1;
            for(int i=1;i<=num;i++)
                fact*=i;
            System.out.println("Factorial: "+fact);
            System.out.println("-------------------------------");
        }
}
class test
{
    public static void main(String[] args) {
        Laba1 x= new Laba1();
        int age;
        shape h = new shape(6,"олег");
        dog sobaka = new dog(3,"Gosha");
        Circle circle = new Circle();
        Human human = new Human(2,2,1);
        human.intoHuman();
        Book book = new Book("orwell","1984","yellow",true);
        book.info();
        x.a();
        x.b();
        x.c();
        x.random1();
        x.random2();
        x.factorial();
        h.tostring();
        System.out.println(sobaka.ToString());
    }
}
