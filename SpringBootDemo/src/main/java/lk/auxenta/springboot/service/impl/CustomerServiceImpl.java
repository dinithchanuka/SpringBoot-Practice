package lk.auxenta.springboot.service.impl;

import lk.auxenta.springboot.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String getMyName() {
        return "Dinith Chanuka" ;
    }

    @Override
    public int getAge() {
        return 10;
    }

}
