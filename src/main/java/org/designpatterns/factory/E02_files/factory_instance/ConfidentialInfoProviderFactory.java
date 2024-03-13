package org.designpatterns.factory.E02_files.factory_instance;

import org.designpatterns.factory.E02_files.infoprovider.InfoProvider;
import org.designpatterns.factory.E02_files.factory_contract.InfoProviderFactory;
import org.designpatterns.factory.E02_files.infoprovider.ConfidentialInfoProvider;

public class ConfidentialInfoProviderFactory implements InfoProviderFactory {
    @Override
    public InfoProvider getInfoProvider() {
        return new ConfidentialInfoProvider();
    }
}
