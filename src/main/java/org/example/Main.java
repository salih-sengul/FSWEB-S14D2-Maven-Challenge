package org.example;

import org.example.model.Lamp;
import org.example.model.enums.LampType;

public class Main {
    public static void main(String[] args) {


        Lamp lamp = new Lamp(LampType.LAVA,false,55);

        System.out.println(lamp.getStyle());

    }
}