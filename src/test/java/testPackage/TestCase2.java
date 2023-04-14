package testPackage;

import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestCase2 {
    @Test
    public void isMoreThenZero(){
        Solution s= new Solution();
        Assert.assertTrue(s.solution(10)>0);
    }

}
