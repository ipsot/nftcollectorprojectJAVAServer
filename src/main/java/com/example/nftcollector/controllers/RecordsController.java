package com.example.nftcollector.controllers;


import com.example.nftcollector.dtos.RecordDto;
import com.example.nftcollector.models.Record;
import com.example.nftcollector.services.RecordsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/records",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@AllArgsConstructor
public class RecordsController {

    @Autowired
    private RecordsService recordsService;

    @GetMapping(value = "/getAll")
    public ArrayList<RecordDto> getAll(){
        return recordsService.getAll();
    }
    @GetMapping(value = "/getById/{id}")
    public RecordDto getById(@PathVariable int id){
        return recordsService.getById(id);
    }

    @DeleteMapping(value = "deleteById/{id}")
    public void deleteById(@PathVariable int id){

    }

//    @PutMapping(value = "/updateById/{id}")
//    public RecordDto updateById(@PathVariable int id, @RequestBody Record record){
//        return
//    }


}
