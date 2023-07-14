
## immutable object are simply objects whose state cannot be changes after construction.

how to make a class immutable:
1. make a class final : so that it can not be inherited and subclass setter can not change the value
2. make al the class variable final: so that the value can not be changed
3. do not provide setter
4. initialize all the field in constructor 
5. return the copy of mutable variables (mutable class fields)


why immutable:

1. it resolves the synchronization problem in multithreaded environment
2. since string is immutable there is a concept of String pool in  java(String pool)
3.

# why  immutable should be final: so that it can not be inherited and subclass can not change the value by providing setter method