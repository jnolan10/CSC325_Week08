package com.mycompany.csc325_week08;

//Class for creating Tops
public class Tops {
    private String clothesType;
    private String clothesName;
    
    //Tops created with style variable input
    public Tops(String clothesT){
        this.clothesType = clothesT;
        this.clothesName = "Top";
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public String getClothesType() {
        return clothesType;
    }

    public void setClothesType(String clothesType) {
        this.clothesType = clothesType;
    }
    
    
}
