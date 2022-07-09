import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        double mas[] = {1, 2, 3, 2, 5, 9, 7};
        //double[] mas={1,2,3,4,5,6,7};

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println('\n'+"Одномерные массивы");
        //Одномерные массивы
        //2.1.1
        double k=2;
        for (int i=0; i<mas.length;i++){
            if(mas[i]%k==0)
            System.out.print(mas[i]+" ");
        }
        System.out.println(" ");

        //2.1.4
        double max= Double.MIN_VALUE;
        double min =Double.MAX_VALUE;
        double q=0;
        for (int i=0; i<mas.length;i++){
            max=Math.max(max,mas[i]);
            min=Math.min(min,mas[i]);
        }
        for (int i=0; i<mas.length;i++) {
            if (mas[i] == max) {
                mas[i] = min;
                q = i;
            }
        }
            for (int i=0; i<mas.length;i++){
                if(mas[i]==min && i!=q){
                    mas[i]=max;
                }
                System.out.print(mas[i]+" ");
            }

        System.out.println(" ");

        //2.1.9
        double mas1[]={0,0,0,0,0,0,0};
        int w=0;
        double number=0;
        for(int i=0;i<mas.length; i++){
            w=0;
            for (int j=0; j< mas.length; j++){
                if (mas[i]==mas[j]){
                    w++;
                    mas1[i]=w;
                }
            }
        }
        for(int i=0;i<mas1.length; i++){
            for (int j=0; j< mas1.length; j++){
                if(mas1[i]>mas1[j]){
                    w=i;
                    number = mas[i];
                }
            }
        }
        System.out.println(number);
        System.out.println(" ");


        System.out.println("Массивы массивов ");
        //Массивы массивов
        //2.2.2
        double m[][] = {{2, 3}, {5, 6}};
        for(int i=0;i<m.length;i++){
            for (int j=0; j<m[i].length; j++){
                if(i==j)
                System.out.println(m[i][j]);
            }
        }

        System.out.println(" ");
        //2.2.7
        for(int i=0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=((Math.pow(i,2)-Math.pow(j,2))/m.length);
                System.out.print(m[i][j]+" ");
            }
        }

        System.out.println(" ");
        //2.2.12
        for(int i=0;i<m.length;i++){
            for (int j=0; j<m[i].length; j++){
            Arrays.sort(m[i]);
            }
        }
        for(int i=0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }
        System.out.println(" ");

        //2.2.13
        for(int i=0;i<m.length;i++){
            for (int j=0; j<m[i].length; j++){
                Arrays.sort(m[j]);
            }
        }
        for(int i=0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }
        System.out.println('\n');

        System.out.println("Сортировки ");
        //Сортировки
        System.out.println("Сортировка выбором");
        //2.3.3
        //Сортировка выбором (по возрастанию)
        int arr[] = {62, 84, 32, 5, 0, 14, 52, 82, 58, 71};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");

        //2.3.4
        //Сортировка Обменами
        System.out.println("Сортировка обменами");
        int arr2[] = {25, 34, 65, 4, 75, 8, 2, 5, 7, 1, 55};
        bubble(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
        System.out.println("");

        //2.3.5
        //Сортировка вставками
        System.out.println("Сортировка вставками");
        int arr3[] = {15, 50, 62, 25, 36, 75};
        insertionSort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "  ");
        }
        System.out.println("");

        //2.3.6
        //Сортировка Шелла
        System.out.println("Сортировка Шелла");
        int arr4[] = {8,65,85,62,25,34,55};
        int h = 1;
        while (h*3 < arr4.length)
            h = h * 3 + 1;

        while(h >= 1) {
            shellSort(arr4, h);
            h = h/3;
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + "  ");
        }
        System.out.println('\n');


        //Декомпозиция с использованием методов
        System.out.println("Декомпозиция с использованием методов");

        //2.4.1
        int a=17, b=22;
        int c=0;
        c=(a*b/gcd(a,b));
        System.out.println(c);

        //2.4.2
        int aa=9, bb=11;
        c=gcd(gcd(a,b),gcd(aa,bb));
        System.out.println(c);

        //2.4.7
        int z=9;
        System.out.println(factorial(z));

        //2.4.10
        int n=5;
        addMas(n);
        System.out.println(" ");

        //2.4.13
        System.out.println(simple(z));
        //bliznec(n,2*n);

        //2.4.15
        int ww=123;
        System.out.println(checkNumber(ww));





    }

    private static int checkNumber(int ww) {
        int y=ww;
        int c = 1, z=ww%10;
        ww/=10;
        while (ww>0){
        c= ww % 10;
        if(z-1==c) {
            ww /= 10;
            z=c;
        }else y=0;
        }
        return y;
    }

    private static void bliznec(int n, int i) {
        int mas[]=new int[i-n+1];
        while (n<=i){
            if (simple(n)>0 && simple(n+2)>0){
                for(int j=0; j<i-n+1; j++){
                    if(mas[j]!=mas[j-1]){
                    mas[j]=n;
                    j++;
                    mas[j]=n+2;
                    }else mas[j]=n+2;
                }
            }
        }
    }

    private static int simple(int z) {
        int c=0;
        for(int i=2; i<z; i++){
            if(z % i != 0){
                c=0;
            } else  c=z;
        }
        z=c;
        return z;
    }

    private static void addMas(int n) {
        int[] mas=new int[n];
        for (int i=0; i<n; i++){
            mas[i]=n;
            System.out.print(mas[i]+" ");
        }
    }

    private static int factorial(int z) {
        int c=1;
        for (int i=1; i<=z; i=i+2){
            c=c*i;
        }
        z=c;
        return z;
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void shellSort(int[] arr, int h) {
       /* int temp=0;
       for(int i=arr.length/2;i>0;i++){
           if(arr[i]>arr[i+1]){
               temp = arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
               i=i-2;
           }
       }*/
        int length = arr.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (arr[j] < arr[j - h])
                    swap(arr, j, j - h);
                else
                    break;
            }
        }
    }

    private static void bubble(int[] arr2) {
        for (int i = arr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int tmp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = tmp;
                }
            }
        }
    }

    private static void insertionSort(int[] arr3) {
        for (int i = 1; i < arr3.length; i++) {
            int current = arr3[i];
            int j = i - 1;
            while (j >= 0 && current < arr3[j]) {
                arr3[j + 1] = arr3[j];
                j--;
            }
            arr3[j + 1] = current;
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
