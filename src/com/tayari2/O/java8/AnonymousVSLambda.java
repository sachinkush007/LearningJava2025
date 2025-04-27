package com.tayari2.O.java8;

public class AnonymousVSLambda {
    int a = 20;

    //Use case oF variable

    public void doSomeThing() {

        //Lambda expression
        //int a=10;
        Employee employee = () -> {
            //We can't reassign the value of local variable in LAMBDA expression
            //BUT We can reassign the value of instance variable;
            // a = 5;
            System.out.println(this.a);
            return 100;
        };

        employee.salery();
        Employee employee1 = new Employee() {
            int a = 12;

            @Override
            public int salery() {
                System.out.println(a);
                return 200;
            }
            public String test(){
                return "Hello i am a normal method";
            }
        };
        employee1.salery();
    }

    public static void main(String[] args) {
        //Anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is Anonymous Class");
            }
        };

        //Using Lambda
        Runnable runnable1 = () -> {
            System.out.println("This is Lambda");
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        AnonymousVSLambda vsLambda = new AnonymousVSLambda();
        vsLambda.doSomeThing();
    }


}
