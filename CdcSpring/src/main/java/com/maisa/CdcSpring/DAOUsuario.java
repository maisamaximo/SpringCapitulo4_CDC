package com.maisa.CdcSpring;

import javax.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named("daoUsuario")
public class DAOUsuario extends AbstractDAO {

    @Qualifier("dataSourceUsuario")
    private DataSource dataSource;
}
