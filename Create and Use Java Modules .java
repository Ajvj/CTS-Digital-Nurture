Create and Use Java Modules program:
public class Util {
    public static void greet() {
        System.out.println("Hello from utils!");
    }
}
com.greetings/module-info.java

module com.greetings {
    requires com.utils;
}
com.greetings/Main.java

package com.greetings;
import com.utils.Util;

public class Main {
    public static void main(String[] args) {
        Util.greet();
    }
}
