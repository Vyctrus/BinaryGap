package testPackage;

import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class TestCase3 {
    private int N;
    private int expected;

    public TestCase3(int N,int expected){
        this.N=N;
        this.expected=expected;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {529,4},
                {20,1},
                {15,0},
                {32,0},
                {1041,5}
        });
    }

    @Test
    public void solutionTest(){
        Solution s=new Solution();
        Assert.assertTrue(s.solution(N)==expected);
    }

}
