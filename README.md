Project features multiplication of numbers using two algorithms.<br />

One uses BigInteger class to perform needed calculations. This has been coded in src/main/java/calc/MultBigInteger.java<br />
Second one features a multiplication method coded from scratch simulating how a human would multiply very big numbers. This has been coded in src/main/java/calc/MultFromScratch.java<br />

Main.java - Running a program requires user to input 3 arguments:  Usage: --alg1/--alg2 <num1> <num2><br />
&emsp;--alg1 calls BigInteger implementation<br />
&emsp;--alg2 calls implementation from scratch<br />
&emsp;num1 and num2 are expected to be integers<br />


Project also features unit tests which are located in: src/test/java/calc<br />
&emsp;MultBigIntegerTest.java is used to test functionality and correctness of BigInteger implementation<br />
&emsp;MultFromScratchTest.java is used to test functionality and correctness of implementation from scratch

