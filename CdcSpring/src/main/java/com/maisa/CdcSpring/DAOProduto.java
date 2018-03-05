package com.maisa.CdcSpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

@Named
public class DAOProduto extends AbstractDAO{

    @PostConstruct
    public void init() {
        System.out.println("\n\n\nDAO Produto iniciado\n\n\n");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("\n\n\nDAO Produto Finalizado\n\n\n");
    }
}
