package creation.abstractFactory.factory.oracle;

import creation.abstractFactory.domain.product.dao.ProductDao;
import creation.abstractFactory.domain.product.dao.mysql.ProductMysqlDao;
import creation.abstractFactory.domain.userinfo.dao.UserInfoDao;
import creation.abstractFactory.domain.userinfo.dao.oracle.UserInfoOracleDao;
import creation.abstractFactory.factory.DaoFactory;

public class OracleDaoFactory implements DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMysqlDao();
    }
}
