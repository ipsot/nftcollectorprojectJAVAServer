package com.example.nftcollector.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
@Table(name="records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public String nickname;

    @Column
    public int money_count;
    @Column
    public int items;
    @Column(name = "unix_datetime")
    public long unixDatetime;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    public Country country;

}
