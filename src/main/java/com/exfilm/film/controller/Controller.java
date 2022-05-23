package com.exfilm.film.controller;

import com.exfilm.film.Attore;
import com.exfilm.film.Cinema;
import com.exfilm.film.Film;
import com.exfilm.film.Regista;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller
{
    ArrayList<Attore> attori = new ArrayList<>();
    ArrayList<Film> film = new ArrayList<>();
    ArrayList<Regista> registi = new ArrayList<>();
    ArrayList<Cinema> cinema = new ArrayList<>();
    @GetMapping("/insertattori")
    ResponseEntity<String> insertAtt(@RequestBody String json)
    {
        Gson gson = new Gson();
        Attore attore = gson.fromJson(json, Attore.class);
        attori.add(attore);
        System.out.println(attore.getNome() + " " + attore.getCognome() + " " + attore.getTipoRecit() + " " + attore.getTelefono() + " " + attore.getEta());
        return ResponseEntity.status(201).body(json);
    }
    @GetMapping("/insertfilm")
    ResponseEntity<String> insertFilm(@RequestBody String json)
    {
        Gson gson = new Gson();
        Film film1 = gson.fromJson(json, Film.class);
        film.add(film1);
        System.out.println(film1.getTitolo() + " " + film1.getGenere() + " " + film1.getDataUscita());
        return ResponseEntity.status(201).body(json);
    }
    @GetMapping("/insertregista")
    ResponseEntity<String> insertReg(@RequestBody String json)
    {
        Gson gson = new Gson();
        Regista regista = gson.fromJson(json, Regista.class);
        registi.add(regista);
        System.out.println(regista.getNome() + " " + regista.getCognome() + " " + regista.getTipoRegia() + " " + regista.getTelefono() + " " + regista.getEta());
        return ResponseEntity.status(201).body(json);
    }

}
