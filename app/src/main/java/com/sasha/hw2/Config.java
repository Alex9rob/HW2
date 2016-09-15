package com.sasha.hw2;

import java.util.ArrayList;

public class Config
{
    public final static String[] fNames = {"Александр", "Михаил", "Сергей"};
    public final static String[] lNames = {"Пушкин", "Лермонтов", "Есенин"};
    public final static String[] photos = {"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ96kRlIpQ3OPLfruOKLFmkDZOndqd_jhhJatpULSA2wVUmLlS0ig",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0GBqJIN76lOILGzj0HEzx3jtWKIgNIq0FUaBX4GZPFusx-0NKyQ",
            "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcShyKbyEV_XifJz8DpR4Butk5DXvwFwp6oYouFSHrFPQReug6n7jA"};

    public ArrayList getPersonData()
    {
        ArrayList listperson = new ArrayList();
        for(int i = 0; i < fNames.length; i++)
        {
            listperson.add(new Person(photos[i],fNames[i],lNames[i]));
        }
        return listperson;
    }
}
