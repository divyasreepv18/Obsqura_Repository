package samplePrograms;

class Demo {
    static int staticVar = 10;     // static variable
    int instanceVar = 20;          // instance variable

    void method() {
        int localVar = 30;         // local variable
        System.out.println(localVar + instanceVar + staticVar);
    }
}
