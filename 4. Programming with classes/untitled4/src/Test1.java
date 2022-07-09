public class Test1 {
int a=4;
int b=8;
Test1(){
    int a=4;
    int b=8;
}
Test1(int a, int b){
    this.a=a;
    this.b=b;
}
public void setA(int a){
    this.a=a;
}
public void setB(int b){
    this.b =b;
}
public int getA(){
    return a;
}
public int getB(){
    return b;
}
void printclass(){
    System.out.println(b+" and " +a);
}
public int summa(){
    return a+b;
}
public int max(){
    if(a>b)
        return a;
    else return b;
}
}


