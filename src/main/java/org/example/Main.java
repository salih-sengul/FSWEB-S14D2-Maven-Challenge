package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {


        Bedroom bedroom= new Bedroom("ilk yatak odası",new Wall("sol"),new Wall("sağ"),new Wall("ön"),new Wall("arka"),new Ceiling(3, PaintColor.GREEN),new Lamp(LampType.LAVA,true,50),new Bed("Queen",2,70,1,1),new Wardrobe(3,3,50),new Carpet(4,5,PaintColor.RED));

        System.out.println(bedroom);

        bedroom.getCeiling().create();


    }
}