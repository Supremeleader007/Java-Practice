class TestParent{
    static void printSome(){
        System.out.println("From Parent");
    }
    static void printSome2(){
        System.out.println("From Parent 2");
    }
    private static void printSome3(){
        System.out.println("From Parent private");
    }
    static void callPrivate(){
        printSome3();
    }
    public static int add(int a, int b){
        System.out.println("add parent(int a, int b)");

        return a+b;
    }
}

class Test4 extends TestParent{
    public static void main(String[] args){
        // printSome();
        // printSome2();
        // //printSome3();
        // callPrivate();
        add(1,2);
        add(1,2,3);
    } 

    public static int add(int a, int b){
        System.out.println("add(int a, int b)");

        return a+b;
    }
    public static int add(int a, int b,int c){
        System.out.println("add(int a, int b,int c)");

        return a+b+c;
    }

    
} 