package com.example.nftcollector.repositories;

import com.example.nftcollector.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordsRepository  extends  JpaRepository<Record,Integer>{
}
