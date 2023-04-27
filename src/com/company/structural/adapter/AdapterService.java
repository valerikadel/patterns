package com.company.structural.adapter;

import com.company.structural.adapter.external.ExternalCar;
import com.company.structural.adapter.external.ExternalService;
import com.company.structural.adapter.external.ExternalServiceImpl;
import com.company.structural.adapter.internal.InternalCar;
import com.company.structural.adapter.internal.InternalService;

public class AdapterService implements InternalService {
    private final ExternalService externalService;
    public AdapterService() {
        this.externalService = new ExternalServiceImpl();
    }
    @Override
    public InternalCar build(String name, String mark, String wheel, int length, int weight) {
        ExternalCar externalCar = externalService.create();
        externalCar.setName(name);
        externalCar.setWheel("left");
        externalCar.setWight(weight);
        externalCar.setLength(length);
        return convertFromExternalToInternal(externalCar);
    }
    @Override
    public InternalCar buildOwn() {
        ExternalCar externalCar = externalService.create();
        externalCar.setLength(1500);
        externalCar.setWight(1500);
        externalCar.setWheel("left");
        return convertFromExternalToInternal(externalCar);
    }
    private InternalCar convertFromExternalToInternal(ExternalCar externalCar){
        return new InternalCar(externalCar.getName(),externalCar.getMark(),externalCar.getWheel(),externalCar.getLength(),externalCar.getWight());
    }
}
