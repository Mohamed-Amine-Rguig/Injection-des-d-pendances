package me.medev.dependency_injection.service;

import me.medev.dependency_injection.repository.IDoa;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class IServiceImpl implements IService {

    private IDoa doa;

    public IServiceImpl(@Qualifier("IDoaImpl2") IDoa doa) {
        this.doa = doa;
    }

    @Override
    public double calculate() {
       double t= doa.getData();
       double calc = t * 0.1;
       return calc;
    }
}
