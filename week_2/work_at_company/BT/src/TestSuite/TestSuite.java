package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BT_1_1.CircleTest.class,
   BT_1_2.CircleTest.class,
   BT_1_3.RectangleTest.class
})

public class TestSuite {   
}  	