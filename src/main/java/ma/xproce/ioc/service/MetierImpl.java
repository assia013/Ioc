package ma.xproce.ioc.service;

import ma.xproce.ioc.dao.entities.DataImpl;
import ma.xproce.ioc.dao.repositories.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MetierImpl implements IMetier{
    @Autowired
    @Qualifier("data")
    private IData datacall;
    @Override
    public double calcul() {
        double data= datacall.getData();
        return 15.6*data;
    }
    public void setDao(DataImpl data) {
        this.datacall = data;
    }


    public void setDatacall(DataImpl datacall) {
        this.datacall = datacall;
    }

    public DataImpl getDatacall() {
        return (DataImpl) datacall;
    }
}
