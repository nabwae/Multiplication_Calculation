Project features multiplication of numbers using two algorithms.

One uses BigInteger class to perform needed calculations. This has been coded in src/main/java/calc/MultBigInteger.java
Second one features a multiplication method coded from scratch simulating how a human would multiply very big numbers. This has been coded in src/main/java/calc/MultFromScratch.java

Main.java - Running a program requires user to input 3 arguments:  Usage: --alg1/--alg2 <num1> <num2>
  --alg1 calls BigInteger implementation
  --alg2 calls implementation from scratch
  num1 and num2 are expected to be integers


Project also features unit tests which are located in: src/test/java/calc
  MultBigIntegerTest.java is used to test functionality and correctness of BigInteger implementation
  MultFromScratchTest.java is used to test functionality and correctness of implementation from scratch

