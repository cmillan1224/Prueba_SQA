package co.sqasa.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target REVIEW_ORDER = Target.the("Lista de productos").locatedBy("//div[@id='order_review']");
    public static final Target QUANTITY_FIRST_PRODUCT = Target.the("Cantidad primer producto").locatedBy("//input[@name='cart[4e55139e019a58e0084f194f758ffdea][qty]']");
    public static final Target QUANTITY_SECOND_PRODUCT = Target.the("Cantidad Segundo producto").locatedBy("//input[@name='cart[fe649fc6b39a300d772435f4f47b08a3][qty]']");
}
