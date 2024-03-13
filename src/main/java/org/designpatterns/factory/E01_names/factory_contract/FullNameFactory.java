package org.designpatterns.factory.E01_names.factory_contract;

import org.designpatterns.factory.E01_names.fullname.FullName;

public interface FullNameFactory {
    FullName getFullName(String names);
    boolean checkPattern(String names);
}
