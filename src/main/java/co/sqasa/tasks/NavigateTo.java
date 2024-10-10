package co.sqasa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable flowerShop(){
        return Task.where("{0} opens the flower shop page",
                Open.url("https://sanangel.com.co/")
                );
    }
}
