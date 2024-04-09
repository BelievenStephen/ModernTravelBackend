package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        if (customerRepository.count() == 1) {
            Customer tony = new Customer();
            tony.setFirstName("Tony");
            tony.setLastName("Stark");
            tony.setAddress("10880 Malibu Point");
            tony.setPostal_code("90265");
            tony.setPhone("2129704133");

            Customer steve = new Customer();
            steve.setFirstName("Steve");
            steve.setLastName("Rogers");
            steve.setAddress("569 Leaman Place");
            steve.setPostal_code("12532");
            steve.setPhone("6781367092");

            Customer thor = new Customer();
            thor.setFirstName("Thor");
            thor.setLastName("Odinson");
            thor.setAddress("100 Bifrost Way");
            thor.setPostal_code("77777");
            thor.setPhone("5555558467");


            Customer bruce = new Customer();
            bruce.setFirstName("Bruce");
            bruce.setLastName("Banner");
            bruce.setAddress("42 Gamma Court");
            bruce.setPostal_code("89001");
            bruce.setPhone("6781367092");

            Customer peter = new Customer();
            peter.setFirstName("Peter");
            peter.setLastName("Parker");
            peter.setAddress("201 Web Way");
            peter.setPostal_code("11375");
            peter.setPhone("2129327737");

            customerRepository.save(tony);
            customerRepository.save(steve);
            customerRepository.save(thor);
            customerRepository.save(bruce);
            customerRepository.save(peter);
        }
    }
}