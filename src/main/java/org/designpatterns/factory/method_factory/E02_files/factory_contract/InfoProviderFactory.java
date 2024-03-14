package org.designpatterns.factory.method_factory.E02_files.factory_contract;

import org.designpatterns.factory.method_factory.E02_files.infoprovider.InfoProvider;

public interface InfoProviderFactory {
    InfoProvider getInfoProvider();
}
