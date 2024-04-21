package com.example.msformation;

import com.example.msformation.entities.Formation;
import com.example.msformation.rep.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.text.SimpleDateFormat;

@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {
    @Autowired
    FormationRep formationRep;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        formationRep.save(new Formation(null,"intergiciel",new SimpleDateFormat("yyyy-MM-dd").parse("2024-02-15")));
        formationRep.save(new Formation(null,"web",new SimpleDateFormat("yyyy-MM-dd").parse("2024-02-15")));
        formationRep.save(new Formation(null,"réseau",new SimpleDateFormat("yyyy-MM-dd").parse("2024-02-15")));

    }
}
