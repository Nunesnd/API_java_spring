package com.example.nunesnd.API.Services;

import java.util.ArrayList;
import java.util.List;

import com.example.nunesnd.API.Models.Profissional;

public class ProfissionalServices {
    public static List<Profissional> profissionals(){
        var lista = new ArrayList<Profissional>();

        lista.add(new Profissional(1,"João"));
        lista.add(new Profissional(2,"Maria"));
        lista.add(new Profissional(3,"José"));
        lista.add(new Profissional(4,"Sara"));

        return lista;
    }
}
