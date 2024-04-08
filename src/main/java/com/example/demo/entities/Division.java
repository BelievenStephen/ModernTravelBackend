package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "divisions")
@Getter
@Setter
@NoArgsConstructor
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long id;

    @Column(name = "division")
    private String division_name;

    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;

    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_Update;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @OneToMany(mappedBy = "division")
    private Set<Customer> customers;

//    Got this code below from video, likely later on in project

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="Country_ID", nullable = false, insertable = false, updatable = false)
//    private Country country;

//    TODO verify, not in UML but appears necessary
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
//    private set<Customer> customers = new HashSet<>();

//    TODO fix for ront end not populate division
//    @Column(name = "Country_ID")
//    private long country_id;
//    public void setCountry(Country country) {
//        setCountry_id(country.getId());
//        this.country = country;
//    }
}
