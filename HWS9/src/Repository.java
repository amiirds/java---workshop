import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repository implements AutoCloseable {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds", "ds123");
    }

    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into Employee (id, name, age, job) values (?,?,?,?)");
        preparedStatement.setString(1, entity.getId());
        preparedStatement.setString(2, entity.getName());
        preparedStatement.setString(3, entity.getAge());
        preparedStatement.setString(4, entity.getJob());
        preparedStatement.executeUpdate();

    }
    public void update(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("update Employee set name = ?, age = ?, job = ? where id = ?");
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getAge());
        preparedStatement.setString(3, entity.getJob());
        preparedStatement.setString(4, entity.getId());
        preparedStatement.executeUpdate();
    }
    public void delete(Entity entity) throws Exception {
            preparedStatement = connection.prepareStatement("delete from Employee where id = ? ");
            preparedStatement.setString(1,entity.getId());
            preparedStatement.executeUpdate();
        }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
