package com.kypala.repository;

import com.kypala.domain.Play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class SpringDataCLR implements CommandLineRunner {

    private final PlayRepository playRepository;

    @Autowired
    public SpringDataCLR(PlayRepository playRepository) {
        this.playRepository = playRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Rally", "Footbal", "Tenis",
                "Bobslay", "Sprint", "Basketball")
                .forEach( name -> playRepository.save(new Play(name)));
        playRepository.findAll().forEach(System.out::println);
    }
}
