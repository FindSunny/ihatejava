# Getting to Know the Language

- # [Objects, Classes, Interfaces, Packages, and Inheritance](https://dev.java/oop/)
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
        > 二生三 (Maybe not, after I learned about interfaces)

        > *Always be cool.* Implementing an interface allows a class to become more formal about the behavior it promises to provide. 
    - What is a Package?
        >三生万物 (I think this is <二生三>. 3 is chaos.)

        > A package is a namespace that organizes a set of related classes and interfaces.

        > Try these out: [The Java Platform API Specification](https://docs.oracle.com/en/java/javase/18/docs/api/index.html) 
        
- # [Java Language Basics](https://dev.java/learn/java-language-basics/)
    
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
    
    > ***Speed Up since now!!!!***

    - [Using Operators in Your Programs](https://dev.java/learn/using-operators-in-your-programs/)
        - Boring! [Check Summary](https://dev.java/learn/summary-of-operators/)
        > instanceof: can be used to Classes, Superclasses and Interfaces
    
    - [Expressions, Statements and Blocks](https://dev.java/learn/expressions-statements-and-blocks/)
        - Boring!
        > ***Notice***: [Floating Point Arithmetic is gross](https://www.youtube.com/watch?time_continue=39&v=ajaHQ9S4uTA&feature=emb_logo). Think about the code below:

            double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
            System.out.println("d1 == 1 ? " + (d1 == 1.0));
        > 

    - [Control Flow Statements](https://dev.java/learn/control-flow-statements/)
        - Boring!
        
        > `if` `for` `while` `do-while` `break` `continue` `return` `yield`

        > Think about the code below:

            // infinite loop
            for ( ; ; ) {
                // do something
            }

            // the enhanced for to loop
            int[] myArray = {1, 2, 3};
            for (int i : myArray) {
                System.out.println(i);
            }
    - [Branching with Switch Statements](https://dev.java/learn/branching-with-switch-statements/)
        - Boring!

    - [Branching with Switch Expressions](https://dev.java/learn/branching-with-switch-expressions/)
        - Boring!

                int quarter = ...; // any value

                String quarterLabel =
                    switch (quarter) {
                        case 0  -> "Q1 - Winter";
                        case 1  -> "Q2 - Spring";
                        case 2  -> "Q3 - Summer";
                        case 3  -> "Q3 - Summer";
                        default -> "Unknown quarter";
                    };
                

                int quarter = ...; // any value
                String quarterLabel =
                    switch (quarter) {
                        case 0 :  yield "Q1 - Winter";
                        case 1 :  yield "Q2 - Spring";
                        case 2 :  yield "Q3 - Summer";
                        case 3 :  yield "Q3 - Summer";
                        default: System.out.println("Unknown quarter");
                                yield "Unknown quarter";
                    };

- # [Using Record to Model Immutable Data](https://dev.java/learn/using-record-to-model-immutable-data/)
    
    - "You can't ...You can't...You can't..."

    - ***I do not like this feature.***

- # [Classes and Objects](https://dev.java/learn/classes-and-objects/)

    - [Creating Classes](https://dev.java/learn/creating-classes/)
        > the first letter of a class name should be capitalized, 
        
        > and the first (or only) word in a method name should be a verb.

    - [Defining Methods](https://dev.java/learn/defining-methods/)
        - Boring!

    - [Providing Constructors for your Classes](https://dev.java/learn/providing-constructors-for-your-classes/)
        - Boring!

    - [Calling Methods and Constructors](https://dev.java/learn/calling-methods-and-constructors/)
        - Funny!
        > ***Notice***: Any changes to the values of the parameters exist only within the scope of the method. Both the primitive and reference types are passed by value. ***After the method returns, the values of the parameters are unchanged.***

            public void moveCircle(Circle circle, int deltaX, int deltaY) {
                // code to move origin of circle to x+deltaX, y+deltaY
                circle.setX(circle.getX() + deltaX);
                circle.setY(circle.getY() + deltaY);
                    
                // code to assign a new reference to circle
                circle = new Circle(0, 0);
            }

            moveCircle(myCircle, 23, 56)
    
    - [Creating and Using Objects](https://dev.java/learn/creating-and-using-objects/)
        
        > ***GC POINT:*** You can explicitly drop an object reference by setting the variable to the special value `null`.

    - [More on Classes](https://dev.java/learn/more-on-classes/)

        > *Nothing new here.*

    - [Nested Classes](https://dev.java/learclsn/nested-classes/)

        - Boring! *(Be careful with this feature.)*

    - [When to Use Nested Classes, Local Classes, Anonymous Classes, and Lambda Expressions](https://dev.java/learn/when-to-use-nested-classes-local-classes-anonymous-classes-and-lambda-expressions/)
        - Boring!

- # [Numbers and Strings](https://dev.java/learn/numbers-and-strings/)
    - [Numbers](https://dev.java/learn/numbers/)

        - What is a Number?
            > All of the numeric wrapper classes are ***subclasses of the abstract class*** Number: `Byte, Short, Integer, Long, Float, Double, BigInteger, BigDecimal`

        - How to format it?
            > Formatting Numeric Print Output:

                System.out.format("The value of " + "the float variable is " +
                "%f, while the value of the " + "integer variable is %d, " +
                "and the string is %s", floatVar, intVar, stringVar); 

            > The DecimalFormat Class:

                import java.text.*;

                public class DecimalFormatDemo {

                    static public void customFormat(String pattern, double value ) {
                        DecimalFormat myFormatter = new DecimalFormat(pattern);
                        String output = myFormatter.format(value);
                        System.out.println(value + "  " + pattern + "  " + output);
                    }

                    static public void main(String[] args) {

                        customFormat("###,###.###", 123456.789);
                        customFormat("###.##", 123456.789);
                        customFormat("000000.000", 123.78);
                        customFormat("$###,###.###", 12345.67);  
                    }
                }

        - How to compute it?
            > · Arithmetic operators: +, -, *, /, and %.

            > · The Math class

            > ***Remember***: Allways use the Value of the variable in the computation.
        - Random a number?
            >  `0.0 <= Math.random() < 1.0.`
    - [Characters](https://dev.java/learn/characters/)
        > Boring!

        > Tools you can use:
            >1. ***boolean isLetter***(char ch) and ***boolean isDigit***(char ch) : Determines whether the specified char value is a letter or a digit, respectively.
            >2. ***boolean isWhitespace***(char ch): Determines whether the specified char value is white space.
            >3. ***boolean isUpperCase***(char ch) and ***boolean isLowerCase***(char ch): Determines whether the specified char value is uppercase or lowercase, respectively.
            >4. ***char toUpperCase***(char ch) and ***char toLowerCase***(char ch): Returns the uppercase or lowercase form of the specified char value.
            >5. ***toString(char ch)***: Returns a String object representing the specified character value — that is, a one-character string.

    - [Strings](https://dev.java/learn/strings/)

        - Boring!!!

        - Converting Strings to Numbers
            
                // convert strings to numbers
                float a = (Float.valueOf(args[0])).floatValue(); 
                float b = (Float.valueOf(args[1])).floatValue();
        - Getting Characters and Substrings by Index

                String anotherPalindrome = "Niagara. O roar again!"; 
                // 11 <= index <= 14(15-1)
                String roar = anotherPalindrome.substring(11, 15);
        
    - [String Builders](https://dev.java/learn/string-builders/#length-capacity)
        - Not recommended! *(After Java SE9 only, String is better.)*

    - [Autoboxing and Unboxing](https://dev.java/learn/autoboxing-and-unboxing/)
        - Basically, it is a way to convert primitive types to wrapper classes and vice versa.
        
        > int -> Integer, double -> Double, etc.

        > Boring, too!

- # [Inheritance](https://dev.java/learn/inheritance/)(一生二)
    
    - Inheritance
        > Nothing new here.

    - Overriding and Hiding Methods
        > ***The point is The Overriding priority.***

        > Instance methods > Interface methods > Superclass methods > Default methods

        > ***Static methods***: The version of the hidden static method that gets invoked depends on whether it is invoked from the superclass or the subclass.

    - [Polymorphism](https://dev.java/learn/polymorphism/)
        > Choosing the right method to execute at run time.

        > ***My brain blows up here.***

        > *They told me that `Encapsulation`, `Inheritance`, and `Polymorphism` are the keys to understanding the Java OOP. It's true. But in my opinion, `Object`, `Class`, and `Package` are the key points to the Java OOP ecosystem. They make Java programming alive.*
    
    - [Object as a Superclass](https://dev.java/learn/object-as-a-superclass/)
        > *Eva&YaDang*'s Capabilities.
    
    - [Abstract Methods and Classes](https://dev.java/learn/abstract-methods-and-classes/)

        > ***When you do feel not elegance with Interface, Please consider Abstract Class(Method).***

- # [Interfaces](https://dev.java/learn/interfaces/)
    - Interfaces
        > All abstract, default, and static methods in an interface are implicitly `public`, so you can omit the `public` modifier.

        > All constant values defined in an interface are implicitly `public`, `static`, and `final`. Once again, you can omit these modifiers.

    - Implementing an Interface

        > (Normal stuffs.)

        > ***Default Methods***
            >Default methods enable you to add new functionality to the interfaces of your libraries and ensure binary compatibility with code written for older versions of those interfaces
        
        > ***[Integrating Default Methods into Existing Libraries](https://dev.java/learn/implementing-an-interface/#anchor_7)***
            > I don't like this feature. I'll read this later.

    - ***[Using an Interface as a Type](https://dev.java/learn/using-an-interface-as-a-type/)***
            
        > This feature reminds me of [a speech](https://www.troup.org/userfiles/929/My%20Files/ELA/MS%20ELA/7th%20ELA/Unit%204/Persuasive%20Speech%20that%20silenced%20the%20world%20w%20questions.pdf?id=24256).

            “Here you may be delegates of your governments, busine people, organizers, reporters or politicians.
            But, really, you’re mothers and fathers, sisters and brothers, aunts and uncles and all of you are someone’s child.
            I’m only a child, yet I know we are all part of a family, 5 billion strong, in fact 30 million species strong.
            And borders and governments will never change that.
            I’m only a child, yet I know we are all in this together and should act as one single world towards one single goal.”

- # [Generics](https://dev.java/learn/generics/)

    - Introducing Generics
        > ***Generics***: Generics makes your code more flexible and easy to reuse.
        - 1. Stronger type checks at compile time. 
        - 2. Elimination of casts(Get rid of casts).
        - 3. Enabling programmers to implement generic algorithms(一生二).
        > ***Notice***:
        - Generic Methods：

                public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
                    return p1.getKey().equals(p2.getKey()) &&
                        p1.getValue().equals(p2.getValue());
                }

                boolean same = Util.<Integer, String>compare(p1, p2);
        - Bounded Type Parameters:

                public <U extends Number> void inspect(U u){
                    System.out.println("T: " + t.getClass().getName());
                    System.out.println("U: " + u.getClass().getName());
                }
        - ***Generics, Inheritance, and Subtypes***:
            > You must notice what Subtypes are.
            
                public void someMethod(Number n) { /* ... */ }

                someMethod(new Integer(10));   // OK
                someMethod(new Double(10.1));   // OK

                Box<Number> box = new Box<Number>();
                box.add(new Integer(10));   // OK
                box.add(new Double(10.1));  // OK

                public void boxTest(Box<Number> n) { /* ... */ }

                boxTest(new Box<Integer>());   // NG
                boxTest(new Box<Double>());   // NG
            > Because that `Box<Integer>` and `Box<Double>` are not subtypes of `Box<Number>`.
    - 

