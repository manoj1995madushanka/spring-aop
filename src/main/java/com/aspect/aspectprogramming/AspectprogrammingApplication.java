package com.aspect.aspectprogramming;

import com.aspect.aspectprogramming.config.ProjectConfig;
import com.aspect.aspectprogramming.dao.Song;
import com.aspect.aspectprogramming.service.VehicleService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AspectprogrammingApplication {

    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleServices = context.getBean(VehicleService.class);
        System.out.println(vehicleServices.getClass());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);

    }

}
