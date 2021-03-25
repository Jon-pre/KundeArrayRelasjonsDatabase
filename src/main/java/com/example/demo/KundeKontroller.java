package com.example.demo;

import com.example.demo.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KundeKontroller {

    @Autowired
    KundeRepository rep;



     @PostMapping("/lagre")
     public void lagreRegister(Kunde innKunde){
         rep.lagreKunde(innKunde);
     }

     @GetMapping("/hentalle")
    public List<Kunde> hentRegg(){
         return rep.hentAlleKunder();
     }

     @GetMapping("/slett")
    public void slettAlle(){
       rep.slettAlleKunder();
     }
}
