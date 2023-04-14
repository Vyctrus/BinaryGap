package testPackage;

import org.example.Solution;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.AfterTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCase4 {
    private int N;
    private String expected;

    public TestCase4(int N,String expected){
        this.N=N;
        this.expected=expected;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {529,"1000010001"},
                {20,"10100"},
                {15,"1111"},
                {32,"100000"},
                {1041,"10000010001"}
        });
    }

    @Test
    public void solutionTest(){
        Solution s=new Solution();
        System.out.println(s.toBinary(N) +"---"+expected);
        Assert.assertTrue(s.toBinary(N).equals(expected));
    }
    @AfterClass
    public static void endTestCase4(){
        System.out.println("---------------------End of Test Case 4------------");
    }

}
