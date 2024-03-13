package org.designpatterns.factory.E01_names.factory_instance;

import org.designpatterns.factory.E01_names.factory_contract.FullNameFactory;
import org.designpatterns.factory.E01_names.fullname.FullName;

public class SurnameNameFullNameFactory implements FullNameFactory {
    @Override
    public FullName getFullName(String names) {
        final String[] split = names.split(",\\s+");
        return new FullName(split[1], split[0]);
    }

    @Override
    public boolean checkPattern(String names) {
        return names.matches("^\\w+,\\s+\\w+$");
    }
}
