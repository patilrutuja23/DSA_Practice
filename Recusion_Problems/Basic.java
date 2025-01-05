class Basic {
    public static void main(String[] arg) {
        // int n = 1;
        print();
    }
    public static void print() {
        int n =1;
        if(n == 5) {
            System.out.println("hello ");
            return;
        }
        System.out.println("hello ");
        n++;
        print();
    }
    
}