package com.ale;

import com.google.inject.AbstractModule;

public class UtilModule extends AbstractModule {

    protected void configure() {
        bind(Util1.class);
        bind(Util2.class);
    }

}
