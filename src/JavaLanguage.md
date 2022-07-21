# Getting to Know the Language

- [Objects, Classes, Interfaces, Packages, and Inheritance](https://dev.java/oop/)
    - What is an Object? 
        > 无极生有极，有极生太极，曰为道
        
        > Two points: `status` and `behavior`. **Status**(fields) defines who you are, and **Behaviors**(methods) show your abilities.

    - What is a Class?
        > 道生一

        > A class is a **blueprint** for an object.
        > A Object is a **instance** of a class.
    - What is Inheritance?
        > 一生二

        > Inheritance is the process of **inheriting** the properties of a parent class.
        
        > In the Java programming language, each class is allowed to have one direct superclass, and each superclass has the potential for an unlimited number of subclasses
    
    - What is an Interface?
        > 二生三

        > *Always be cool.* Implementing an interface allows a class to become more formal about the behavior it promises to provide. 
    - What is a Package?
        >三生万物

        > A package is a namespace that organizes a set of related classes and interfaces.

        > Try these out: [The Java Platform API Specification](https://docs.oracle.com/en/java/javase/18/docs/api/index.html) 
        
- [Java Language Basics](https://dev.java/learn/java-language-basics/)
    
    - [Creating Variables and Naming Them](https://dev.java/learn/creating-variables-and-naming-them/)
        > *Create a variable and name it.* 
        
        >Yes agin, you can not name it whatever you want. Java Limits you to use only letters, numbers, and underscores.

        > `final` and `static`, be careful with them. *`static` makes a variable a class variable, and `final` makes it a constant.*

    - [Creating Primitive Type Variables in Your Programs](https://dev.java/learn/creating-primitive-type-variables-in-your-programs/)
        > *Java gives us some chopsticks to fight a bear.*

        > **Notice:**
        - Memory Usage (Range)
                
                byte: -128 to 127                                           8 bits        
                short: -32768 to 32767                                      16 bits
                int: -2147483648 to 2147483647                              32 bits
                long: -9223372036854775808 to 9223372036854775807           64 bits
                float: -3.4028235E38 to 3.4028235E38 32 bits
                double: -1.7976931348623157E308 to 1.7976931348623157E308   64 bits
                boolean: true or false                                      1 bit
                char: '\u0000' to '\uffff'                                  16 bits
        - Default Value *(Only for fields, not for local variables)*

                byte: 0
                short: 0
                int: 0
                long: 0
                float: 0.0
                double: 0.0
                boolean: false
                char: '\u0000'

        - Funny Things
            > *Using Underscore Characters in Numeric Literals*. 
            
            > To separate groups of digits in numeric literals, which can improve the readability of your code.


                // This is a valid numeric literal:
                int myInt = 1_000_000;
                // This is not a valid numeric literal:
                int myInt = 1_000_000_;

    - [Creating Arrays in Your Programs](https://dev.java/learn/creating-arrays-in-your-programs/)

        - ***It's Boring!***
            > *Creating Arrays*.

                int[] myArray = new int[10];
                int myArray[] = new int[10];
            > *Handle with Array*.

                // copy array to another array
                System.arraycopy(source, sourceStart, destination, destinationStart, length);

                // java.util.Arrays
                // sort
                Arrays.sort(array);

                // binary search
                Arrays.binarySearch(array, key);

                // copy array to another array
                Arrays.copyOf(original, newLength);

                // copy array to another array
                Arrays.copyOfRange(original, from, to);

                // equals
                Arrays.equals(array1, array2);
    - [Using the Var Type Identifier](https://dev.java/learn/using-the-var-type-identifier/)

        - Ha~! This is funny, Java turns to Javascript, but limited.

            > Only `local variables with initializers` can be declared with the `var` type.

---
## Speed Up since now!

---

- [Using Operators in Your Programs](https://dev.java/learn/using-operators-in-your-programs/)
    - Boring!
    > instanceof: can be used to Classes, Superclasses and Interfaces

