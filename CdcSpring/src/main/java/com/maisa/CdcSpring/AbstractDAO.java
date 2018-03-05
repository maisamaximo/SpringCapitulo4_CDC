package com.maisa.CdcSpring;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired (required = true)
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
