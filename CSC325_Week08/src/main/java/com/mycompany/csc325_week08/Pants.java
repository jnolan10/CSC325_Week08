/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_week08;

//Class for creating Pants
public class Pants {
    private String clothesType;
    private String clothesName;

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }
          
    //Pants created with style variable input
    public Pants(String clothesT){
        this.clothesType = clothesT;
        this.clothesName = "Pants";
    }

    public String getClothesType() {
        return clothesType;
    }

    public void setClothesType(String clothesType) {
        this.clothesType = clothesType;
    }
    
}
