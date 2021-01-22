package LeetCode.Design.Medium;

import java.util.function.IntConsumer;
/*
Write a program that outputs the string representation of numbers from 1 to n, however:

If the number is divisible by 3, output "fizz".
If the number is divisible by 5, output "buzz".
If the number is divisible by both 3 and 5, output "fizzbuzz".
For example, for n = 15, we output: 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz.

Suppose you are given the following code:

class FizzBuzz {
  public FizzBuzz(int n) { ... }               // constructor
  public void fizz(printFizz) { ... }          // only output "fizz"
  public void buzz(printBuzz) { ... }          // only output "buzz"
  public void fizzbuzz(printFizzBuzz) { ... }  // only output "fizzbuzz"
  public void number(printNumber) { ... }      // only output the numbers
}

Implement a multithreaded version of FizzBuzz with four threads. The same instance of FizzBuzz will be passed to four different threads:
1.Thread A will call fizz() to check for divisibility of 3 and outputs fizz.
2.Thread B will call buzz() to check for divisibility of 5 and outputs buzz.
3.Thread C will call fizzbuzz() to check for divisibility of 3 and 5 and outputs fizzbuzz.
4.Thread D will call number() which should only output the numbers.
*/
public class FizzBuzzMultithreaded {
    class FizzBuzz {
        private int n;
        private Integer i;
    
        public FizzBuzz(int n) {
            this.n = n;
            i = 1;
        }
    
        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            while (i <= n) {
                synchronized (i) {
                    if (i <= n && i % 3 == 0 && i % 5 != 0) {
                        printFizz.run();
                        ++i;
                    }
                }
            }
        }
    
        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            while (i <= n) {
                synchronized (i) {
                    if (i <= n && i % 5 == 0 && i % 3 != 0) {
                        printBuzz.run();
                        ++i;
                    }
                }
            }
        }
    
        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            while (i <= n) {
                synchronized (i) {
                    if (i <= n && i % 3 == 0 && i % 5 == 0) {
                        printFizzBuzz.run();
                        ++i;
                    }
                }
            }
        }
    
        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            while (i <= n) {
                synchronized (i) {
                    if (i <= n && i % 3 != 0 && i % 5 != 0) {
                        printNumber.accept(i);
                        ++i;
                    }
                }
            }
        }
        /*
        private int n;
        private int count;
        
        public FizzBuzz(int n) {
            this.n = n;
            this.count = n;
        }
    
        Semaphore fizz = new Semaphore(0);
        Semaphore buzz = new Semaphore(0);
        Semaphore fizzbuzz = new Semaphore(0);
        Semaphore number = new Semaphore(1);
    
        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            while(count > 0){
                fizz.acquire();
                
                if(count == 0) break;
                
                count--;
                printFizz.run();
                number.release();
            }
        }
    
        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            while(count > 0){
                buzz.acquire();
                
                if(count == 0) break;
                
                count--;
                printBuzz.run();
                number.release();
            }
        }
    
        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            while(count > 0){
                fizzbuzz.acquire();
                
                if(count == 0) break;
                
                count--;
                printFizzBuzz.run();
                number.release();
            }
        }
    
        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            while(count != 0){
                number.acquire();
                
                if((n - count + 1) %5==0 && (n - count + 1) %3 == 0){
                    fizzbuzz.release();
                    continue;
                }
                if((n - count + 1)%3==0){
                    fizz.release();
                    continue;
                }
                if((n - count + 1)%5==0){
                    buzz.release();
                    continue;
                }
                
                number.release();
                printNumber.accept(n - count + 1);
                count--;
            }
            
            fizz.release();
            buzz.release();
            fizzbuzz.release();
        }
        */
    }
}
