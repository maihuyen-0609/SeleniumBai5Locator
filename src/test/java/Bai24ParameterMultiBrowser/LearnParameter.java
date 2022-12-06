package Bai24ParameterMultiBrowser;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameter {
    @Test
    @Parameters({"number1","number2","Message"})
    public void Sum(@Optional("8")int a,@Optional("1") int b, String message){
        System.out.println(message+":"+(a+b));

    }
}
