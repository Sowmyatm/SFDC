//package important_notes;

//ITERATORS - in java are used in colln fws to retrieve elmts.
// ex: iterator in hashset is used as
// HashSet<String> set = new HashSet<>();
//Iterator<String>Itr = set.iterator();
//while(itr.hasNext())
//{
//	String element = iterator.next();
//	sysout();
//}


//HOW TO DEFINE STRINGS IN JAVA
//Creating a String object.
//String can be created in number of ways,
//1) Using a String literal.
//String str1 = "Hello";

//2) Using new Keyword.
//String str3 = new String("Java");

//SUPER CLASS -The class from which the subclass is derived is called a superclass.
//SUPER KEYWORD - The super keyword in Java is a reference variable that is used to refer parent class objects


//SET :  interface that extends collection interface, order is not maintained, used to store unique elts,doesn't
//allow duplicates

//LIST: interface that extends collection interface, insertion order is maintained, duplicate elts are allowed,
//elets in list are accessed by indexing

//QUEUE: Elements are inserted at the back (enqueue) and removed from the front (dequeue) of the queue. 

//ASSERT: Assert statements are used to verify that a condition is true during test execution. IF IT is true ,
//continues to the nxt step. if it false, the exectn halts.

//VERIFY:  Verify statements are used to check the state of a system under test during automated testing. exctn 
//doesn't halts if the condition is false

//COLLN API : is a FW used to store and manipulate data for group of projs. it is a pkg of DS used in arraylist, ll,
//hashset etc.

//ABSTRACT CLASS= obj cannot be created, can not be final

//INTERFACE CONCEPT USED BY YOU -  selenium proj can not directly interact with the browser, so used webdriver 
//interface. where the webdriver interface whenever sendin the req, over the http in json format,and passe on to 
//web drivers,like chrome, firefox etc, the browser responds back to the exe file and then passes to webdriver
//interface and then to THE application.

//static poly - occurs compile time, relates to method overloading 

//dynamic poly - occurs at run time, relates to method overriding

//METHOD OVERLOADING= static type poly,If a class have multiple methods by same name but different parameters(argumenents)
//may or may not require inheritance


//METHOD OVERRIDING = dynamic poly, In specific implementation of the method is provided by the base class or parent class
//require inheritance
//If subclass (child class) has the same method as declared in the parent class

//Why multiple inheritance is not there in java?
//The reason behind this is to prevent ambiguity.Consider a case where class B extends class A and 
//Class C and both class A and C have the same method display().Now java compiler cannot decide, which display 
//method it should inherit. To prevent such situation, multiple inheritances is not allowed in java.

//annotations in java
//@override - to override a method from a superclass
//@deprecated-  It indicates that a declaration has been replaced by a newer form
//@supress warning- It is used to inform the compiler to suppress specified compiler warnings

//primitive data types- int, bool,char,float,double -> cannot create objects of primitive datatypes, 
//coz it doesn't have any class
 
//non primitive- String->objs can be created
 
//Can we overload CONSTRUCTOR? -- yes
//Constructor name should be same as class name
//Constructor has no static or void.i.e, it doesn't return any value. It is not a function
//Constructor will be called immediately after creating the object of particular class
//access modifiers can be used for constructors
//constructors cannot be abstract, static and final
	

//FINAL is a keyword used to make the variables,methods and class as constant
//If methods and classes are made final, it can't be inherited by child class. (see example testPackage) 

//FINALIZE is a method
//related to garbage collection
//Garbage collector destroys the objects that has no reference
//Finalize is automatically called just  before garbage collector to perform cleanup memory processing
//Finalize method will be automatically called even if we dont call it in main function	

//FINALLY is a  block always executes after try-catch block no matter if you have an exception or not.

//ERRORS can not be handled, prb occured in sm resource, compile time

//EXCEPTION is a problem that occurs during runtime time bcoz there will be some problem in the code
//UNCHECKED EXCEPTIONSS OR runtime exception  occurs during runtime due to prb in the code, it can be handled using
//try catch block -arrayindex out of bound,file not found exception, arithmetic, nullpointer etc

//CHECKED OR compile time exceptions or other exceptions-- cannot be handled. it has to be addressed at the compile
//time IO exceptions

//try catch block can be used for exceptions, for 1 try block there should be atleast 1 catch block
//can have nested try catch block

//by default the capacity of Arraylist is 10

//The main difference between List and Set is that Set is unordered and contains different elements, 
//whereas the list is ordered and can contain the same elements in it.



//THROWABLE - is an interface and is also a super class  of exceptions and errors. they extends from throwable 
//class

//THROW--is a keyword to throw an exception explicitly, located in method body. Only one exception type can be 
//thrown

//THROWS--keyword used to declare an exception, located in method declaration. can declare multiple exceptions

//private variables can be accessed using setter and getter methods

//GENERICS--parameterized types.(works with different data types)
//collections- set of interfaces and classes
//The idea is to allow data types(int, float etc)  to be a parameter to methods, classes, and interfaces
//An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

//ENUMS : An enum is a special "class" that represents a group of constants (unchangeable variables, like final 
//variables).To create an enum, use the enum keyword, and separate the constants with a comma. Note that they 
//should be in uppercase letters:
//Ex : enum Level {
//					LOW,
//					MEDIUM,
//					HIGH
//				}
//You can access enum constants with the dot syntax:
//Level myVar = Level.MEDIUM;


//DEFAULT : no keyword, allows access within same package, classes extending default cannot inherit

//PRIVATE: Allows access only within same class. It is specified using the keyword private. used in banking appln
//can be assccesd by using setter and getter methods.

//PUBLIC:  Classes, methods or data members declared as public can be accessed everywhere within the program. 
//It is specified using the keyword public
//ex:we used public in our base test class so that other classes extending base test can access it 

//PROTECTED -The code is accessible in the same package and subclasses, can be inherited by the subclasses


//byte	1 byte	Stores whole numbers from -128 to 127
//short	2 bytes	Stores whole numbers from -32,768 to 32,767
//int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//boolean	1 bit	Stores true or false values
//char	2 bytes

//What is synchronized and non synchronized collection?
//------------------------------------------------------------
//A synchronized collection implies that the class is thread safe. (You can have non-synchronized collections
//that are also thread safe, but that is a topic for about thousand theses another day.) The collections 
//synchronize mutations by obtaining locks to make sure that other threads don't corrupt the state






