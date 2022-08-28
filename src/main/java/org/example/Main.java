package org.example;

import org.example.superheros.AquaMan;
import org.example.superheros.SpiderMan;
import org.example.superheros.factory.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        for (Superhero s : factory.Factory()) {
            System.out.println(s.superPower());
            System.out.println(s.getLabel());
            System.out.println(s.getLvl());
        }
    }
}