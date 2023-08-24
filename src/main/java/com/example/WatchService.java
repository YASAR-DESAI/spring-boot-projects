package com.example;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class WatchService {

    Watch watch1 = new Watch("Rolex", "Daytona", LocalDate.of(1983, Month.AUGUST, 23), 120000);
    Watch watch2 = new Watch("AP", "Royal Oak", LocalDate.of(1995, Month.APRIL, 17), 70000);
    public List<Watch> watches= List.of(watch1, watch2);

    public List<Watch> getList(){

        return watches;
    }

    public void addWatchToTheList(Watch watch){

        watches.add(watch);

    }

}
