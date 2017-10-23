import java.sql.Connection;
import org.apache.log4j.Logger;

abstract class Dao {


    final static Logger log = Logger.getLogger(Dao.class);

    private void getInsertQuery() {
     StringBuffer sb =new StringBuffer("INSERT INTO ");
     sb.append(this.getClass().getSimpleName());

     log.info(sb.toString());




    }


    public void insert() {
        String query =getInsertQuery();
       /* Connection c = getConnection();

        c.prepareStatement(query);
        */


    }


    public void select() {
        StringBuffer ss = new StringBuffer("SELECT* FROM ");
                    ss.append(this.getClass().getSimpleName());
                    //log.info(ss.toString());
    }

    public void update() {


    }

    public void delete() {

    }


}
