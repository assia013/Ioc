package ma.xproce.ioc.dao.entities;

import ma.xproce.ioc.dao.repositories.IData;
import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData {
    @Override
    public double getData() {
        System.out.println("Recuperation de la Base de données ");
        double data = 10;
        return data;
    }


}
