package me.medev.dependency_injection.repository;

import org.springframework.stereotype.Repository;

@Repository("IDoaImpl2")
public class IDoaImpl2 implements IDoa {
    @Override
    public double getData() {
        System.out.println("DB API:");
        return 1908;
    }
}
