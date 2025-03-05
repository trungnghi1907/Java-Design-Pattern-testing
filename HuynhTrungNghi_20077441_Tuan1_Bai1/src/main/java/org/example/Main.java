package org.example;

import singleton.example.json.*;
import java.lang.reflect.Constructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // Kiểm tra Eager Singleton
//        EagerInitializedSingleton eager1 = EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton eager2 = EagerInitializedSingleton.getInstance();
//
//        System.out.println(eager1.hashCode());
//        System.out.println(eager2.hashCode());

//        // Kiểm tra Lazy Singleton
//        LazyInitializedSingleton lazy1 = LazyInitializedSingleton.getInstance();
//        LazyInitializedSingleton lazy2 = LazyInitializedSingleton.getInstance();
//        System.out.println(lazy1.hashCode());
//        System.out.println(lazy2.hashCode());

//        // Kiểm tra Thread-Safe Singleton
//        ThreadSafeSingleton threadSafe1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
//        ThreadSafeSingleton threadSafe2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
//        System.out.println(threadSafe1.hashCode());
//        System.out.println(threadSafe2.hashCode());

//        // Kiểm tra Bill Pugh Singleton
//        BillPughSingleton billPugh1 = BillPughSingleton.getInstance();
//        BillPughSingleton billPugh2 = BillPughSingleton.getInstance();
//        System.out.println(billPugh1.hashCode());
//        System.out.println(billPugh1.hashCode());
////
//        // Kiểm tra Static Block Singleton
//        StaticBlockSingleton staticBlock1 = StaticBlockSingleton.getInstance();
//        StaticBlockSingleton staticBlock2 = StaticBlockSingleton.getInstance();
//        System.out.println(staticBlock1.hashCode());
//        System.out.println(staticBlock2.hashCode());

        //Kiểm tra Reflection to destroy Singleton Pattern
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {

        //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)
                        constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

    EnumSingleton instance1 = EnumSingleton.get ;
    EnumSingleton instance2 = EnumSingleton.INSTANCE;

    // Kiểm tra hashCode (cả hai instance phải có cùng giá trị)
        System.out.println(instance1.hashCode());
        System.out.println(instance1.hashCode());
    // Kiểm tra instance có giống nhau không (nếu giống nhau thì là Singleton)
        if (instance1 == instance2) {
        System.out.println(" Enum Singleton hoạt động chính xác! Cả hai instance đều giống nhau.");
    } else {
        System.out.println(" Enum Singleton bị lỗi! Có nhiều hơn một instance.");
    }
   }

