package com.company.structural.adapter;

import com.company.structural.adapter.internal.InternalService;
import com.company.structural.adapter.internal.InternalServiceImpl;

public class Main {
    public static void main(String[] args) {
        // как с нашим сервисом работали ранее
        InternalService internalService = new InternalServiceImpl();
        System.out.println( internalService.buildOwn());

        //как теперь - с внешним
        InternalService newInternalService = new AdapterService();
        System.out.println(newInternalService.buildOwn());
    }
}
