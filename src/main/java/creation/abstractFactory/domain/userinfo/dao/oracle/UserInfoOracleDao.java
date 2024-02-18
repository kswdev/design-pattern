package creation.abstractFactory.domain.userinfo.dao.oracle;

import creation.abstractFactory.domain.userinfo.UserInfo;
import creation.abstractFactory.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB productId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB productId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from ORACLE DB productId = " + userInfo.getUserId());
    }
}
