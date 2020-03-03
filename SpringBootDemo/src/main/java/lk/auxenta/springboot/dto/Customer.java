package lk.auxenta.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {

    String nic;
    String name;
    String address;
    int age;

}
