package com.mycompany.csc325_week08;

public class Outfit {
    private boolean match;
    private String tCat;
    private String sCat;
    private String pCat;
    
    //Takes in 3 pieces of clothing to create an outfit
    //Tests if the clothes are matching, and sets the matching
    //variable of the outfit accordingly
    public Outfit(Tops t, Pants p, Shoes s){
        this.tCat = t.getClothesType();
        this.sCat = s.getClothesType();
        this.pCat = p.getClothesType();
        if(this.tCat.equalsIgnoreCase(this.sCat) && this.tCat.equalsIgnoreCase(this.pCat))
            this.match = true;
        else this.match = false;
    }
    
    //Tostring override to show all styles of the makeup of the outfit, as well as the matching result
    @Override
    public String toString(){
        return "Outfit: \n" + "Top: " + this.tCat + "\nPants: " + this.pCat + "\nShoes: " + this.sCat + "\nMatch: " + this.match + "\n";
    }
    
}
