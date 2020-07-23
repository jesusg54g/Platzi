package com.jesus.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * <h1>Magazine</h1>
 * <p>
 * La clase Magazine hereda de {@link Publication} y nos permite visualizar
 * las revistas del catalogo a traves del metodo {@code makeMagazineList()}
 * </p>
 *
 * @author Drakj
 * @version 1.1
 * @since 2020
 * */

public class Magazine extends Publication {
    private int id;

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n ::: MAGAZINE :::" +
                "\nTitle: " + getTitle() +
                "\nEditorial: " + getEditorial() +
                "\nEdition Date: " + getEditionDate();
    }

    public static ArrayList<Magazine> makeMagazineList() {
        ArrayList<Magazine> magazines = new ArrayList();
        String[] authors = new String[3];
        for (int i = 0; i < 3; i++) {
            authors[i] = "author "+i;
        }
        for (int i = 1; i <= 5; i++) {
            magazines.add(new Magazine("Magazine " + i, new Date(), "Editorial " + i));
        }

        return magazines;
    }
}
