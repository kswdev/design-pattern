package creation.abstractFactory.factory;

import creation.abstractFactory.domain.product.dao.ProductDao;
import creation.abstractFactory.domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {
    public UserInfoDao createUserInfoDao();
    public ProductDao createProductDao();
}
