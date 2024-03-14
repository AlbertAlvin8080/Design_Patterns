package org.designpatterns.factory.method_factory.E01_names.factory_instance;

import org.designpatterns.factory.method_factory.E01_names.factory_contract.FullNameFactory;
import org.designpatterns.factory.method_factory.E01_names.fullname.FullName;

public class NameSurnameFullNameFactory implements FullNameFactory {

    @Override
    public FullName getFullName(String names) {
        final String[] split = names.split("\\s+");
        return new FullName(split[0], split[1]);
    }

    @Override
    public boolean checkPattern(String names) {
        return names.matches("^\\w+\\s+\\w+$");
    }
}
