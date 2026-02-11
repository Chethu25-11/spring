package com.xworkz.finance.Runner;

import com.xworkz.finance.config.SpringConfig;
import com.xworkz.finance.entity.FinanceEntity;
import com.xworkz.finance.service.FinanceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FinanaceRunner {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        FinanceService service = context.getBean(FinanceService.class);

        FinanceEntity entity = new FinanceEntity();
        entity.setCustomerName("vinay");
        entity.setLoanType("Home Loan");
        entity.setAmount(500000);

        service.validateSaveAndFinanceInfo(entity);

        service.validateAndFindAllFinanceEntity()
                .forEach(System.out::println);
    }
}
