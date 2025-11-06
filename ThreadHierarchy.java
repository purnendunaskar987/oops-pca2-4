/**
 * 1. The "Main" or "Parent" Thread Class
 * This class inherits from Java's built-in Thread class.
 */
class MyMainThread extends Thread {
    
    // This is the "job" for this parent-level thread.
    @Override
    public void run() {
        System.out.println("   (Parent's run() method is running...)");
        // We have removed the Thread.sleep() and try/catch block
        // to make the code simpler.
        System.out.println("   (Parent's run() method is finishing.)");
    }
}


/**
 * 2. The "Child" Thread Class
 * This class inherits from OUR "MyMainThread" class.
 */
class MyChildThread extends MyMainThread {
    
    // We are OVERRIDING the run() method from MyMainThread.
    @Override
    public void run() {
        System.out.println("MyChildThread: Starting my own job!");
        
        // --- Call the parent's run() method ---
        System.out.println("MyChildThread: Calling my parent's run() method first...");
        super.run(); // This runs the code from MyMainThread's run() method
        
        // --- Now, do the child's specific work ---
        System.out.println("MyChildThread: ...Parent's job is done. Now I'll do my work.");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyChildThread: Counting " + i);
            // We removed the Thread.sleep() and try/catch block here too.
        }
        
        System.out.println("--- MyChildThread has finished. ---");
    }
}


/**
 * 3. The Main Class to Run Everything
 */
public class ThreadHierarchy {
    
    public static void main(String[] args) {
        System.out.println("Main: Creating the child thread object...");
        
        // Create an instance of the CHILD class
        MyChildThread child = new MyChildThread();
        
        System.out.println("Main: Starting the child thread...");
        
        // Call .start() on the child object.
        // This will start a new thread and execute
        // the run() method from MyChildThread.
        child.start();
        
        System.out.println("Main: Main method is done.");
    }
}