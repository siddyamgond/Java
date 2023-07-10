class Test {
    public static void main(String[] args) {
       int a=1,b=2;
       System.out.println("Before swap "+a+" "+b);
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("After swap "+a+" "+b);
    }
}
