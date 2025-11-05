package com.pluralsight.finance;

public interface Valuable {
    //this method needs to be overridden to any class it gets implemented into
    public double getValue();
    //NOTE: the difference between an abstract class and an interface is that an abstract can only be inherited once
    //by a child class, meanwhile, more than one interface can be implemented for a single class
    //Ex: public class Dog extends Animal <== the parent class, Animal, is abstract
    //    public class Cat implements Pet, Hunter <== the Cat class implements methods from both interfaces, Pet and Hunter
}
