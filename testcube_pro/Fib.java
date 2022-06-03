// Fib.java
public class Fib {
int fibonacchi(int x){
if(x<2){
return 0;
}
return fibonacchi(x-1)+fibonacchi(x-2);
}
}
