import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    @Given("user go to login page")
    public void userGoToLoginPage() {
    }

    @And("user input username {string}")
    public void userInputUsername(String arg0) {
    }

    @And("user input pwd {string}")
    public void userInputPwd(String arg0) {
    }

    @And("user click login button")
    public void userClickLoginButton() {
    }

    @Then("user verify see cart icon")
    public void userVerifySeeCartIcon() {
    }

    @Then("user verify see errmsg {string}")
    public void userVerifySeeErrmsg(String arg0) {
    }

    @And("user click add to cart")
    public void userClickAddToCart() {
    }

    @Then("verify cart item has {string}")
    public void verifyCartItemHas(String arg0) {
    }

    @And("user click remove item chart")
    public void userClickRemoveItemChart() {
    }

    @And("user click sort item high to low")
    public void userClickSortItemHighToLow() {
    }

    @And("user click sort item Z to A")
    public void userClickSortItemZToA() {
    }
}
