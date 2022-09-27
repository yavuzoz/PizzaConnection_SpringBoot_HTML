package ch.bfh.ti.pizzaconnection_springboot_html.entity;
/**
 * Baverage
 *
 * @author  Yavuz Özbay
 *version 1.0
 */
public class Baverage {
    private String drinkImage;

    private String drinkName;

    private String drinkPreis;

    public Baverage(String drinkImage, String drinkName, String drinkPreis) {
        this.drinkImage =drinkImage;
        this.drinkName =drinkName;
        this.drinkPreis =drinkPreis;
    }

    public String getDrinkImage() {
        return drinkImage;
    }

    public void setDrinkImage(String drinkImage) {
        this.drinkImage = drinkImage;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkPreis() {
        return drinkPreis;
    }

    public void setDrinkPreis(String drinkPreis) {
        this.drinkPreis = drinkPreis;
    }
}
