package CodingTest.LeetCode.Design.Easy;

public class PrintInOrder {
    class Foo {
        private boolean first;
        private boolean second;
    
        public Foo() {
            first = false;
            second = false;
        }

        public synchronized void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            first = true;
            notifyAll();
        }

        public synchronized void second(Runnable printSecond) throws InterruptedException {
            while(!first) wait();
        
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            second = true;
            notifyAll();
        }

        public synchronized void third(Runnable printThird) throws InterruptedException {
            while(!second) wait();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
        /*
        final Lock lock = new ReentrantLock();
        final Condition cond2  = lock.newCondition(); 
        final Condition cond3  = lock.newCondition(); 
        volatile int count=1;
    
        public Foo() {
        
        }

        public void first(Runnable printFirst) throws InterruptedException {
            lock.lock();
            try {
                printFirst.run(); // printFirst.run() outputs "first". Do not change or remove this line.
                count++;
                cond2.signal();
            } finally {
                lock.unlock();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            lock.lock();
            try {
                while(count!=2){
                    // waiting on the condition backed by same lock 
                    cond2.await(); 
                }

                printSecond.run(); // printSecond.run() outputs "second". Do not change or remove this line.
                count++;
                cond3.signal();
            } finally {
                lock.unlock();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            lock.lock();
            try {
                while(count!=3){
                    // waiting on the condition backed by same lock
                    cond3.await();
                }
                printThird.run(); // printThird.run() outputs "third". Do not change or remove this line.
            } finally {
                lock.unlock();
            }
        }
        */
    }
}
