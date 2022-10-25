package com.mycompany.csc325_week08;

public class Main {
    //Testing
    public static void main(String[] args) {
        
        /*Initializing different clothing items, making sure to
        change case as an employee entering a new type of item
        may accidently mess up the case despite intending for
        the same type of item to be input*/
        Tops t1 = new Tops("party");
        Pants p1 = new Pants("pArTy");
        Shoes s1 = new Shoes("Party");
        
        Tops t2 = new Tops("caSUal");
        Pants p2 = new Pants("Casual");
        Shoes s2 = new Shoes("casuAl");
        
        Tops t3 = new Tops("formal");
        Pants p3 = new Pants("forMal");
        Shoes s3 = new Shoes("Formal");
        
        
        //Creating outfits with 1 mathcing and 1 mismatching
        Outfit o1 = new Outfit(t1,p1,s1);
        Outfit o2 = new Outfit(t1,p2,s3);
        
        //toString override prints 1 matching outfit and one not 
        System.out.println(o1.toString());
        System.out.println(o2.toString());
    }
    
}
