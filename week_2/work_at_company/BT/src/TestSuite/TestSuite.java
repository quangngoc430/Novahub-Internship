package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BT_1_1.CircleTest.class,
   BT_1_2.CircleTest.class,
   BT_1_3.RectangleTest.class,
   BT_1_4.EmployessTest.class,
   BT_1_5.InvoiceItemTest.class,
   BT_1_6.AccountTest.class,
   BT_1_7.DateTest.class,
   BT_1_8.TimeTest.class,
   BT_2_1.AuthorTest.class
})

public class TestSuite {   
}  	