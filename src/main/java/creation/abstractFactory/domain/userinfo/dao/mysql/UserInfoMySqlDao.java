package creation.abstractFactory.domain.userinfo.dao.mysql;

import creation.abstractFactory.domain.userinfo.UserInfo;
import creation.abstractFactory.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MySql DB productId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MySql DB productId = " + userInfo.getUserId());

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MySql DB productId = " + userInfo.getUserId());
    }
}
