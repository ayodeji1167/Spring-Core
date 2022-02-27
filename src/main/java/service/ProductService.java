package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ProductRepo;


@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;


    /**
     * REQUIRED (DEFAULT)
     * REQUIRES_NEW (Always create a new transaction)
     * MANDATORY (You need to already have a transaction to be able to execute this method)
     * NEVER (Opposite of mandatory, meaning you should never have a transaction
     *           to call this method otherwise, Exception will be thrown)
     * SUPPORTS (Method will work if you have or do not have a transaction...depends on who is calling
     * NOT_SUPPORTED (Allows you to call with or without transaction BUT never use the transaction)
     * NESTtED (Creating Another Transaction Inside A Transaction)
     */
    @Transactional()
    public void addNewProduct() {
        productRepo.addProduct("Beans");
        throw new RuntimeException("kylian");
    }

}
