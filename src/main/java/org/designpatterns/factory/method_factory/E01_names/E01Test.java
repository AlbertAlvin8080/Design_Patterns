package org.designpatterns.factory.method_factory.E01_names;

import org.designpatterns.factory.method_factory.E01_names.factory_contract.FullNameFactory;
import org.designpatterns.factory.method_factory.E01_names.factory_instance.NameSurnameFullNameFactory;
import org.designpatterns.factory.method_factory.E01_names.factory_instance.SurnameNameFullNameFactory;
import org.designpatterns.factory.method_factory.E01_names.fullname.FullName;

import java.util.ArrayList;
import java.util.List;

public class E01Test {
    public static void main(String[] args) {
        System.out.println();
        if (args.length == 0)
            args = new String[]{"McNealy, Scott", "James Gosling", "Naughton, Patrick"};

        final FullNameFactory nameSurnameFactory = new NameSurnameFullNameFactory();
        final FullNameFactory surnameNameFactory = new SurnameNameFullNameFactory();

        List<FullName> fullNameList = new ArrayList<>();
        for (String current : args) {
            if (nameSurnameFactory.checkPattern(current)) {
                fullNameList.add(nameSurnameFactory.getFullName(current));
            } else if (surnameNameFactory.checkPattern(current)) {
                fullNameList.add(surnameNameFactory.getFullName(current));
            }
        }

        fullNameList.forEach(System.out::println);
    }
}
