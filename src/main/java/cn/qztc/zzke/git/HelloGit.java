package cn.qztc.zzke.git;

public class HelloGit {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("Hello Git!");
        System.out.println("Hello Git!");
        System.out.println("hello hotfix");
        int a = 18, b = 17;
        System.out.println(String.format("%d + %d = %d", a, b, sum(a, b)));
    }
    public static int sum(int a,int b) {
        return  a + b;
    }
}
