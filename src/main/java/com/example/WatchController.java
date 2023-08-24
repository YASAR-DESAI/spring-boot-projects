package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WatchController {

    @Autowired
    WatchService watchService;

    @GetMapping("/watches")
    public List<Watch> getWatchList(){

        return watchService.getList();

    }

    @PostMapping("/add")
    public void addWatch(@RequestBody Watch watch){

        watchService.addWatchToTheList(watch);

    }


}
