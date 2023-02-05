package com.aspect.aspectprogramming.service;

import com.aspect.aspectprogramming.dao.Song;
import com.aspect.aspectprogramming.interfaces.Speakers;
import com.aspect.aspectprogramming.interfaces.Tyres;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;

@Component
public class VehicleService {
    private Logger logger = LoggerFactory.getLogger(VehicleService.class);

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;


    public String playMusic(boolean vehicleStarted, Song song) {
        Instant start = Instant.now();
        logger.info("method execution start");
        String music = null;
        if (vehicleStarted) {
            music = speakers.makeSound(song);
        } else {

        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("time took to execute method : " + timeElapsed);
        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if (vehicleStarted) {
            status = tyres.rotate();
        } else {
            logger.error(String.valueOf(Level.SEVERE), "vehicle not started to perform operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("time took to execute method : " + timeElapsed);
        return status;
    }

    public String applyBrake(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if (vehicleStarted) {
            status = tyres.stop();
        } else {
            logger.error(String.valueOf(Level.SEVERE), "vehicle not started to perform operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("time took to execute method : " + timeElapsed);
        return status;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
