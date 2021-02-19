package test;
 
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
 
public class TestClassParallel {
 
    @Test
    public void test() {
        Class[] cls = { DemoTest.class, DemoTest2.class,DemoTest3.class,DemoTest4.class };
 
        // Parallel among classes
        JUnitCore.runClasses(ParallelComputer.classes(), cls);
 

    }
}
