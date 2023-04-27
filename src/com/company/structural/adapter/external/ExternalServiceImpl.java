package com.company.structural.adapter.external;

public class ExternalServiceImpl implements ExternalService {
    private Builder builder;
    public ExternalServiceImpl() {
        builder = new BuilderImpl();
    }
    @Override
    public ExternalCar create() {
        builder = builder.name("asia")
                .wight(1000)
                .length(1000)
                .mark("asia mark")
                .wheel("right");
        return builder.build();
    }
}
