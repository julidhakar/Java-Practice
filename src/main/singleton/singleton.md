# singleton: means only one instance of the class can be created

# why singleton: 
  1. do avoid multiple creation of object and save the memory wastage 

# when to use singleton:
  logger is one of the example
  db connection is the example
  
# why doubly lock:
   to avoid synchronize block everytime, suppose t1 has already initialized instance,
   dn t2,t3 etc. don't need to go inside sync block.

# why getInstance is static:
  because here constructor is private we can not create object so using getInstance we will initialize the object
  and we can call getInstance using class name, since it is a static.