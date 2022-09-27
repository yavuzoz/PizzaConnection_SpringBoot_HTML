package ch.bfh.ti.pizzaconnection_springboot_html.entity;
/**
 * Pizzas
 *
 * @author  Yavuz Özbay
 *version 1.0
 */
public class Pizzas {

     private  String image;

     private String species;

     private String ingredient;

     private String preissmall;

     private String preislarge;

    public Pizzas (String image,String species, String ingredient, String preissmall, String preislarge) {
        this.image= image;
        this.species=species;
        this.ingredient= ingredient;
        this.preissmall= preissmall;
        this.preislarge= preislarge;
    }


    public String getPreislarge() {
        return preislarge;
    }

    public void setPreislarge(String preislarge) {
        this.preislarge = preislarge;
    }

    public String getPreissmall() {
        return preissmall;
    }

    public void setPreissmall(String preissmall) {
        this.preissmall = preissmall;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

}
