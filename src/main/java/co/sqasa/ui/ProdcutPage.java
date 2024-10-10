package co.sqasa.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProdcutPage {
    public static final Target SECOND_PRODUCT = Target.the("Segundo producto seleccionado").locatedBy("//*[@data-product_id='6053']");
    public static final Target ADD_TO_CART = Target.the("Botón agregar al carrito").locatedBy("//button[@class='single_add_to_cart_button button alt']");
}
