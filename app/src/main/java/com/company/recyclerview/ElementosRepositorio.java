package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Pokemon> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Pokemon> elementos);
    }

    ElementosRepositorio() {
        elementos.add(new Pokemon("Bulbasaur", "https://pokeapi.co/api/v2/pokemon-species/1/"));
        elementos.add(new Pokemon("Ivysaur", "https://pokeapi.co/api/v2/pokemon-species/2/"));
        elementos.add(new Pokemon("Venusaur", "https://pokeapi.co/api/v2/pokemon-species/3/"));
        elementos.add(new Pokemon("Charmander", "https://pokeapi.co/api/v2/pokemon-species/4/"));
        elementos.add(new Pokemon("Charmeleon", "https://pokeapi.co/api/v2/pokemon-species/5/"));
        elementos.add(new Pokemon("Charizard", "https://pokeapi.co/api/v2/pokemon-species/6/"));
        elementos.add(new Pokemon("Squirtle", "https://pokeapi.co/api/v2/pokemon-species/7/"));
    }

        List<Pokemon> obtener() {
        return elementos;
    }



}
