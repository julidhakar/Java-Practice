# Lambda Expression:
     it actually expresses instance of functional interface. in the previous versions we have to create a class
     to implement the interface and give defination of interface method. in here using lambda we can directly 
     define functional methods

# Functional Interface :
   Annotation @FunctionalInterface, the interface which can have anly one abstract method, but can have multiple default methods
  
built in java funtional interface;
   1. runnable
   2. comparable
   3. callable
   4. Action Listener

java 8 introduced new functional interface
    
   1. consumer : will have one argument and no return type, Bi-Consumer: will have 2 arguments and no return type
                 basically used for iterating collections.
   2. supplier : return value
   3. predicate : returns boolean
   4. function : 2 argument, ist is parameter, second is returntype.
     