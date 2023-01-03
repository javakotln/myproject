package com.teno;
public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();  //new Person物件出來

        Person p = new Person();  //等號右邊就是先在記憶體當中生出一個(Person)物件,在將物件的地址寫在一張叫p的紙上面
        p.hello();  //用p去呼叫hello這個方法
    }
}
