package com.company;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InstantiationException {
        Test t = new Test();
        t.setA(15);
        t.setB("Yeaaah");
        String res = Serializer.serialize(t);
        System.out.println("Serialized: "+res);
        t = Serializer.deserialize(res, Test.class);
        System.out.println("Deserialized: "+t.getA()+", "+t.getB());
    }
}
