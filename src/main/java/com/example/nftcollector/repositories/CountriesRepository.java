package com.example.nftcollector.repositories;

import com.example.nftcollector.models.Country;
import com.example.nftcollector.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends  JpaRepository<Country,Integer>{
}
