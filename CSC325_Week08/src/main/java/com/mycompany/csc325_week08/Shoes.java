/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_week08;

//Class for creating Shoes
public class Shoes {
    private String clothesType;
    private String clothesName;

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }
    
    //Shoes created with style variable input
    public Shoes(String clothesT){
        this.clothesType = clothesT;
        this.clothesName = "Shoes";
    }

    public String getClothesType() {
        return clothesType;
    }

    public void setClothesType(String clothesType) {
        this.clothesType = clothesType;
    }
}
