package creation.abstractFactory.main;

import creation.abstractFactory.domain.product.Product;
import creation.abstractFactory.domain.product.dao.ProductDao;
import creation.abstractFactory.domain.userinfo.UserInfo;
import creation.abstractFactory.domain.userinfo.dao.UserInfoDao;
import creation.abstractFactory.factory.DaoFactory;
import creation.abstractFactory.factory.mysql.MysqlDaoFactory;
import creation.abstractFactory.factory.oracle.OracleDaoFactory;

public class WebClient {

    public static void main(String[] args) {

        String dbType = "MYSQL";

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("123345");

        Product product = new Product();
        product.setProductId("0011AA");
        DaoFactory daoFactory = null;

        if (dbType.equals("MYSQL")) {
            daoFactory = new MysqlDaoFactory();
        } else if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else {
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        ProductDao productDao = daoFactory.createProductDao();

        userInfoDao.insertUserInfo(userInfo);
        productDao.insertProduct(product);
    }
}
