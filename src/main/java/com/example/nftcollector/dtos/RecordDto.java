package com.example.nftcollector.dtos;


import com.example.nftcollector.models.Country;
import lombok.Data;

import javax.persistence.*;

@Data
public class RecordDto {
    public int id;
    public String nickname;
    public int money_count;
    public int items;
    public long unixDatetime;
    public String country;
}
