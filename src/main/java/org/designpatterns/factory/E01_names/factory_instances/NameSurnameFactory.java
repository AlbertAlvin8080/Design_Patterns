package org.designpatterns.factory.E01_names.factory_instances;

import org.designpatterns.factory.E01_names.factory_contract.FullNameFactory;
import org.designpatterns.factory.E01_names.fullname.FullName;

public class NameSurnameFactory implements FullNameFactory {

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
