package me.medev.dependency_injection.press;


import me.medev.dependency_injection.repository.IDoa;
import me.medev.dependency_injection.service.IService;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2{

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        System.out.println("Pres2: instantiate the service and the repository using a config.txt file and reflection");
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
