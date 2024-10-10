package co.sqasa.questions;

import co.sqasa.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyCart implements Question<Boolean> {

    private String firstProduct="2";
    private String secondProduct="5";

    public static VerifyCart products() {
        return new VerifyCart();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return firstProduct.equals(CheckoutPage.QUANTITY_FIRST_PRODUCT.resolveFor(actor).getValue()) && secondProduct.equals(CheckoutPage.QUANTITY_SECOND_PRODUCT.resolveFor(actor).getValue());
    }
}
