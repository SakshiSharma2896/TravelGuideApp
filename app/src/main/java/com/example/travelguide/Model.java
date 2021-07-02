package com.example.travelguide;

import java.util.Comparator;

public class Model {

    private String tilte;
    private int image;

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public  static  final Comparator<Model> BY_TITLE_ASCENDING= new Comparator<Model>() {
        @Override
        public int compare(Model o1, Model o2) {
            //Ascending
            return o1.getTilte().compareTo(o2.getTilte());
        }
    };

    public  static  final Comparator<Model> BY_TITLE_DESCENDING= new Comparator<Model>() {
        @Override
        public int compare(Model o1, Model o2) {
            //Descending
            return o2.getTilte().compareTo(o1.getTilte());
        }
    };
}