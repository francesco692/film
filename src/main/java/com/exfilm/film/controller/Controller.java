package com.exfilm.film.controller;

import com.exfilm.film.*;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
public class Controller
{
    ArrayList<Attore> attori = new ArrayList<>();
    ArrayList<Film> film = new ArrayList<>();
    ArrayList<Regista> registi = new ArrayList<>();
    ArrayList<Cinema> cinema = new ArrayList<>();
    ArrayList<Partecipazione> part = new ArrayList<>();
    ArrayList<Direzione> dir = new ArrayList<>();
    ArrayList<Proiezione> pro = new ArrayList<>();
    @PostMapping("/insertattori")
    ResponseEntity<String> insertAtt(@RequestBody String json)
    {
        Gson gson = new Gson();
        Attore attore = gson.fromJson(json, Attore.class);
        attori.add(attore);
        System.out.println(attore.getNome() + " " + attore.getCognome() + " " + attore.getTipoRecit() + " " + attore.getTelefono() + " " + attore.getEta());
        return ResponseEntity.status(201).body(json);
    }
    @PostMapping("/insertfilm")
    ResponseEntity<String> insertFilm(@RequestBody String json)
    {
        Gson gson = new Gson();
        Film film1 = gson.fromJson(json, Film.class);
        film.add(film1);
        System.out.println(film1.getTitolo() + " " + film1.getGenere() + " " + film1.getDataUscita());
        return ResponseEntity.status(201).body(json);
    }
    @PostMapping("/insertregista")
    ResponseEntity<String> insertReg(@RequestBody String json)
    {
        Gson gson = new Gson();
        Regista regista = gson.fromJson(json, Regista.class);
        registi.add(regista);
        System.out.println(regista.getNome() + " " + regista.getCognome() + " " + regista.getTipoRegia() + " " + regista.getTelefono() + " " + regista.getEta());
        return ResponseEntity.status(201).body(json);
    }
    @PostMapping("/insertcinema")
    ResponseEntity<String> insertCin(@RequestBody String json)
    {
        Gson gson = new Gson();
        Cinema cinema1 = gson.fromJson(json, Cinema.class);
        cinema.add(cinema1);
        System.out.println(cinema1.getNome() + " " + cinema1.getCitta() + " " + cinema1.getNumPosti() + " " + cinema1.getIndirizzo());
        return ResponseEntity.status(201).body(json);
    }
    @PostMapping("/insertpart")
    ResponseEntity<String> insertPart(@RequestBody String json)
    {
        Gson gson = new Gson();
        Partecipazione partecipazione = gson.fromJson(json, Partecipazione.class);
        boolean result1 = true;
        for(Attore item: attori)
        {
            if(item.getNome().equals(partecipazione.getNomeAttore()) && item.getCognome().equals(partecipazione.getCognomeAttore()))
            {
                result1 = true;
                break;
            }
            else
            {
                result1 = false;
            }
        }
        boolean result2 = true;
        for(Film item1: film)
        {
            if(item1.getTitolo().equals(partecipazione.getTitoloFilm()))
            {
                result2 = true;
                break;
            }
            else
            {
                result2 = false;
            }
        }
        if(result1 && result2)
        {
            part.add(partecipazione);
        }
        System.out.println(partecipazione.getNomeAttore() + " " + partecipazione.getCognomeAttore() + " " + partecipazione.getTitoloFilm());
        return ResponseEntity.status(201).body(json);
    }
    @PostMapping("/insertdir")
    ResponseEntity<String> insertDir(@RequestBody String json)
    {
        Gson gson = new Gson();
        Direzione direzione = gson.fromJson(json, Direzione.class);
        boolean result1 = true;
        for(Regista item: registi)
        {
            if(item.getNome().equals(direzione.getNomeReg()) && item.getCognome().equals(direzione.getCognomeReg()))
            {
                result1 = true;
                break;
            }
            else
            {
                result1 = false;
            }
        }
        boolean result2 = true;
        for(Film item1: film)
        {
            if(item1.getTitolo().equals(direzione.getTitoloFi()))
            {
                result2 = true;
                break;
            }
            else
            {
                result2 = false;
            }
        }
        if(result1 && result2)
        {
            dir.add(direzione);
        }
        System.out.println(direzione.getNomeReg() + " " + direzione.getCognomeReg() + " " + direzione.getTitoloFi());
        return ResponseEntity.status(201).body(json);
    }
    @PostMapping("/insertpro")
    ResponseEntity<String> insertPro(@RequestBody String json)
    {
        Gson gson = new Gson();
        Proiezione proiezione = gson.fromJson(json, Proiezione.class);
        boolean result1 = true;
        for(Cinema item: cinema)
        {
            if(item.getNome().equals(proiezione.getNome_c()) && item.getCitta().equals(proiezione.getCitta_c()))
            {
                result1 = true;
                break;
            }
            else
            {
                result1 = false;
            }
        }
        boolean result2 = true;
        for(Film item1: film)
        {
            if(item1.getTitolo().equals(proiezione.getT_film()))
            {
                result2 = true;
                break;
            }
            else
            {
                result2 = false;
            }
        }
        if(result1 && result2)
        {
            pro.add(proiezione);
        }
        System.out.println(proiezione.getNome_c() + " " + proiezione.getCitta_c() + " " + proiezione.getT_film());
        return ResponseEntity.status(201).body(json);
    }
    @GetMapping("/attorilist")
    ResponseEntity<String> listAt()
    {
        attori.forEach((element) -> System.out.println(element.getNome() + " " + element.getCognome() + " " + element.getTelefono() + " " + element.getTipoRecit() + " " + element.getEta()));
        return ResponseEntity.status(200).body("");
    }
    @GetMapping("/filmlist")
    ResponseEntity<String> listFi()
    {
        film.forEach((element) -> System.out.println(element.getTitolo() + " " + element.getGenere() + " " + element.getDataUscita()));
        return ResponseEntity.status(200).body("");
    }
    @GetMapping("/registilist")
    ResponseEntity<String> listRe()
    {
        registi.forEach((element) -> System.out.println(element.getNome() + " " + element.getCognome() + " " + element.getTelefono() + " " + element.getTipoRegia() + " " + element.getEta()));
        return ResponseEntity.status(200).body("");
    }
    @GetMapping("/cinemalist")
    ResponseEntity<String> listCi()
    {
        cinema.forEach((element) -> System.out.println(element.getNome() + " " + element.getCitta() + " " + element.getNumPosti() + " " + element.getIndirizzo()));
        return ResponseEntity.status(200).body("");
    }
    @GetMapping("/partlist")
    ResponseEntity<String> listpA()
    {
        part.forEach((element) -> System.out.println(element.getNomeAttore() + " " + element.getCognomeAttore() + " " + element.getTitoloFilm()));
        return ResponseEntity.status(200).body("");
    }
    @GetMapping("/attnom")
    ResponseEntity<String> attnom(@RequestParam String nome)
    {
        ArrayList<Attore> subsetattore = (ArrayList<Attore>) attori.stream().filter(element -> element.getNome().equals(nome)).collect(Collectors.toList());
        subsetattore.forEach((element) -> System.out.println(element.getNome() + " " + element.getCognome() + " " + element.getTipoRecit() + " " + element.getEta()));
        return  ResponseEntity.status(200).body("");
    }
}
