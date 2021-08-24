package cn.qztc.zzke.git;

public class HelloGit {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("Hello Git!");
        System.out.println("Hello Git!");
        System.out.println("hello hotfix");
        System.out.println("master test");
        System.out.println("hotfix test");
        System.out.println("push tset");

        int a = 18, b = 17;
        System.out.println(String.format("%d + %d = %d", a, b, sum(a, b)));
        System.out.println(String.format("%d - %d = %d", a, b, diff(a, b)));
    }
    public static int sum(int a,int b) {
        return  a + b;
    }
    public static int diff(int a, int b) {
        return a - b;
    }
}
