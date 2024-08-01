package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone(); // creating Constructor

        phone1.make = "Samsung";
        phone1.modelName = "S24 Ultra";
        phone1.price = 100000;

        System.out.println("Make : "+ phone1.make);
        System.out.println("Model Name : +" + phone1.modelName);
        System.out.println("Price : " + phone1.price);

        phone1.call(phone1.modelName);

        SmartPhone phone2 = new SmartPhone(); // creating Constructor

        phone2.make = "Apple";
        phone2.modelName = "I phone 16";
        phone2.price = 100000;

        System.out.println("Make : "+ phone2.make);
        System.out.println("Model Name : +" + phone2.modelName);
        System.out.println("Price : " + phone2.price);

        phone2.call(phone2.modelName);

        SmartPhone phone3 = new SmartPhone(); // creating Constructor

        phone3.make = "RealMe";
        phone3.modelName = "13 Pro";
        phone3.price = 25000;

        System.out.println("Make : "+ phone3.make);
        System.out.println("Model Name : +" + phone3.modelName);
        System.out.println("Price : " + phone3.price);

        phone3.call(phone3.modelName);
    }
}