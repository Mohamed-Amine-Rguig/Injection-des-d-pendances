package me.medev.dependency_injection.pres2;


import me.medev.dependency_injection.repository.IDoa;
import me.medev.dependency_injection.service.IService;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2{

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Scanner scanner = new Scanner(new File("config.txt"));
        String doaClassName = scanner.nextLine();
        Class doa = Class.forName(doaClassName);
        IDoa d = (IDoa) doa.newInstance();

        String IServiceClassName = scanner.nextLine();
        Class  cService = Class.forName(IServiceClassName);
        IService iService = (IService) cService.getConstructor(IDoa.class).newInstance(d);

        System.out.println(iService.calculate());

    }
}
