package org.designpatterns.factory.method_factory.E02_files;

import org.designpatterns.factory.method_factory.E02_files.factory_contract.InfoProviderFactory;
import org.designpatterns.factory.method_factory.E02_files.factory_instance.ConfidentialInfoProviderFactory;
import org.designpatterns.factory.method_factory.E02_files.factory_instance.PublicInfoProviderFactory;

public class E02Test {
    public static void main(String[] args) {
        System.out.println();
        final InfoProviderFactory publicInfoProviderFactory = new PublicInfoProviderFactory();
        final InfoProviderFactory confidentialInfoProviderFactory = new ConfidentialInfoProviderFactory();

        String info;
        if(args.length != 0 && args[0].equals("designpatterns")) {
            info = confidentialInfoProviderFactory.getInfoProvider().getInfo();
        } else {
            info = publicInfoProviderFactory.getInfoProvider().getInfo();
        }

        System.out.println(info);
    }
}
