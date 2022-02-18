package com.example.nftcollector.services;


import com.example.nftcollector.dtos.RecordDto;
import com.example.nftcollector.models.Record;
import com.example.nftcollector.repositories.RecordsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RecordsService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RecordsRepository recordsRepository;

    public ArrayList<RecordDto> getAll(){
        return (ArrayList<RecordDto>) recordsRepository.findAll().stream().map(record -> modelMapper.map(record,RecordDto.class)).collect(Collectors.toList());
    }

    public RecordDto getById(int id){
       Record record = recordsRepository.findById(id).get();
       RecordDto recordDto=modelMapper.map(record,RecordDto.class);
       return  recordDto;
    }
}
