package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Application {

    public static void main(String args[]) {
        // simple DS for test (not for production!)
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.postgresql.Driver.class);
        dataSource.setUrl("jdbc:postgresql://f18-test.bring.out.ba/test_0018");
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //System.out.println("Creating tables");
        //jdbcTemplate.execute("drop table customers if exists");
        //jdbcTemplate.execute("create table customers(" +
        //        "id serial, first_name varchar(255), last_name varchar(255))");

	System.out.println("Brisem fmk.partn");
        jdbcTemplate.execute("delete from fmk.partn");
        String[] names = "00001 John_Woo;00002 Jeff_Dean;00003 Josh_Bloch;00004 Josh_Long".split(";");
        for (String fullname : names) {
            String[] name = fullname.split(" ");
            System.out.printf("Inserting customer record for %s %s\n", name[0], name[1]);
            jdbcTemplate.update(
                    "INSERT INTO fmk.partn(id,naz) values(?,?)",
                    name[0], name[1]);
        }

        System.out.println("Querying for customer records where id = '00001':");
        List<Customer> results = jdbcTemplate.query(
                "select * from fmk.partn where id = ?", new Object[] { "00001" },
                new RowMapper<Customer>() {
                    @Override
                    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new Customer(rs.getString("id"), rs.getString("naz"));
                    }
                });

        for (Customer customer : results) {
            System.out.println(customer);
        }
    }
}
