package com.xiaojian.git;

public class GitDemo1 {
    public static void main(String[] args) {
        System.out.println("everyont");
        System.out.println("everyont");
        System.out.println("everyont");
        System.out.println("everyont");
        System.out.println("synchronization");
        System.out.println("synchronization");
        System.out.println("synchronization");
        // hello test
        // master
        System.out.println("master");
        //dev1
        System.out.println("dev1");
    }

    public void fun(){
        System.out.println("新增了一个方法");
        int i = 0;
        i++;
        System.out.println(i);
    }
    public void fun2(){
        // master
        System.out.println("测试冲突解决");
    }
}
