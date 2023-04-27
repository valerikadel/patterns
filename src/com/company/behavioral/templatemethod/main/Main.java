package com.company.behavioral.templatemethod.main;

import com.company.behavioral.templatemethod.DocumentFillerTemplate;
import com.company.behavioral.templatemethod.InternalDocumentFiller;
import com.company.behavioral.templatemethod.OutDocumentFiller;

public class Main {
    public static void main(String[] args) {
        DocumentFillerTemplate outTemplate = new OutDocumentFiller();
        outTemplate.createDocument();

        DocumentFillerTemplate inTemplate = new InternalDocumentFiller();
        inTemplate.createDocument();
    }
}
