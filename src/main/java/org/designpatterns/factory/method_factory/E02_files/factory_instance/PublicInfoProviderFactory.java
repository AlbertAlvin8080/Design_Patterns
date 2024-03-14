package org.designpatterns.factory.method_factory.E02_files.factory_instance;

import org.designpatterns.factory.method_factory.E02_files.infoprovider.InfoProvider;
import org.designpatterns.factory.method_factory.E02_files.factory_contract.InfoProviderFactory;
import org.designpatterns.factory.method_factory.E02_files.infoprovider.PublicInfoProvider;

public class PublicInfoProviderFactory implements InfoProviderFactory {
    @Override
    public InfoProvider getInfoProvider() {
        return new PublicInfoProvider();
    }
}
