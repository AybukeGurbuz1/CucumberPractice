package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

import java.io.IOException;

public class ReusableStepDefs {
    @Given("{int} sn bekler")
    public void sn_bekler(Integer int1) {
        try {
            Thread.sleep(int1 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("ekran goruntusu alir")
    public void ekran_goruntusu_alir() {
        try {
            ReusableMethods.getScreenshot("Ekran goruntusu");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
