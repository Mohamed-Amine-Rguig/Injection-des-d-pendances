package me.medev.dependency_injection.press;

import me.medev.dependency_injection.repository.IDoaImpl;
import me.medev.dependency_injection.service.IServiceImpl;

public class Pres1 {

    public static void main(String[] args) {
        IDoaImpl d = new IDoaImpl();
        IServiceImpl iServiceImpl = new IServiceImpl(d);
        System.out.println(iServiceImpl.calculate());
    }
}
