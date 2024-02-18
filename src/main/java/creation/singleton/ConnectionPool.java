package creation.singleton;

public class ConnectionPool {

    private static ConnectionPool instance = new ConnectionPool();

    //외부에서 인스턴스를 생성하지 못하게 private으로 생성자 메서드를 만듬
    private ConnectionPool() {}

    public static ConnectionPool getInstance() {

        //방어적인 코드
        if(instance == null) {
            instance = new ConnectionPool();
        }

        return instance;
    }

    public static void main(String[] args) {
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();

        //true
        System.out.println(instance1 == instance2);
    }
}
