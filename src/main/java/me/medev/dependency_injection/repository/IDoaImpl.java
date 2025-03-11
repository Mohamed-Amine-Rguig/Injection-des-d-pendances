package me.medev.dependency_injection.repository;

import org.springframework.stereotype.Repository;

@Repository
public class IDoaImpl implements IDoa {
    @Override
    public double getData() {
        System.out.println("DB Version:");
        return 1000;
    }
}
