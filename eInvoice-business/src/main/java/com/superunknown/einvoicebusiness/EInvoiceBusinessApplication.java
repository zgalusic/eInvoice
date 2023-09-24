package com.superunknown.einvoicebusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EInvoiceBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(EInvoiceBusinessApplication.class, args);
    }

}
