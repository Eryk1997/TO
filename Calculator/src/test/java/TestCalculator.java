import org.junit.Assert;

public class TestCalculator {
    Calc calculator = new Calculator();

    @org.junit.Test
    public void add(){
        Assert.assertEquals(3,calculator.add(1,2),0.000001);
        Assert.assertEquals(3.2,calculator.add(1.1,2.1),0.000001);
    }

    @org.junit.Test
    public void substract(){
        Assert.assertEquals(5,calculator.subtract(9,4),0.000001);
        Assert.assertEquals(2.1,calculator.subtract(4.2,2.1),0.000001);
    }

    @org.junit.Test
    public void multiplication(){
        Assert.assertEquals(12, calculator.multiplication(2,6),0.00001);
        Assert.assertEquals(5, calculator.multiplication(2.5,2),0.00001);
    }

    @org.junit.Test
    public void division(){
        Assert.assertEquals(3,calculator.division(12,4),0.00001);
        Assert.assertEquals(4,calculator.division(20,5),0.00001);
    }

}
