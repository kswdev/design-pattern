package creation.abstractFactory.factory.mysql;

import creation.abstractFactory.domain.product.dao.ProductDao;
import creation.abstractFactory.domain.product.dao.mysql.ProductMysqlDao;
import creation.abstractFactory.domain.userinfo.dao.UserInfoDao;
import creation.abstractFactory.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import creation.abstractFactory.factory.DaoFactory;

public class MysqlDaoFactory implements DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMysqlDao();
    }
}
