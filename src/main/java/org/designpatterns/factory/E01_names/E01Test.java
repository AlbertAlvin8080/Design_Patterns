package org.designpatterns.factory.E01_names;

import org.designpatterns.factory.E01_names.factory_contract.FullNameFactory;
import org.designpatterns.factory.E01_names.factory_instances.NameSurnameFactory;
import org.designpatterns.factory.E01_names.factory_instances.SurnameNameFactory;
import org.designpatterns.factory.E01_names.fullname.FullName;

import java.util.ArrayList;
import java.util.List;

public class E01Test {
    public static void main(String[] args) {
        System.out.println();
//        args = new String[]{"McNealy, Scott", "James Gosling", "Naughton, Patrick"};

        final FullNameFactory nameSurnameFactory = new NameSurnameFactory();
        final FullNameFactory surnameNameFactory = new SurnameNameFactory();

        List<FullName> fullNameList = new ArrayList<>();
        for(String current : args) {
            if(nameSurnameFactory.checkPattern(current)) {
                fullNameList.add(nameSurnameFactory.getFullName(current));
            } else if(surnameNameFactory.checkPattern(current)) {
                fullNameList.add(surnameNameFactory.getFullName(current));
            }
        }

        fullNameList.forEach(System.out::println);
    }
}
