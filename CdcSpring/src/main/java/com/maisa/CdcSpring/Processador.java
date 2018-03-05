package com.maisa.CdcSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

@Component("processador")
public class Processador {

    private DAOProduto daoProduto;
    private DAOUsuario daoUsuario;
    @Inject
    private  DAOVenda daoVenda;

    public DAOProduto getDaoProduto() {
        return daoProduto;
    }

    @Resource
    public void setDaoProduto(DAOProduto daoProduto) {
        this.daoProduto = daoProduto;
    }

    public DAOUsuario getDaoUsuario() {
        return daoUsuario;
    }

    @Autowired
    public void setDaoUsuario(DAOUsuario daoUsuario) {
        this.daoUsuario = daoUsuario;
    }

    public DAOVenda getDaoVenda() {
        return daoVenda;
    }

    public void setDaoVenda(DAOVenda daoVenda) {
        this.daoVenda = daoVenda;
    }
}
