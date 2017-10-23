import java.sql.Connection;
import org.apache.log4j.Logger;

abstract class Dao {


    final static Logger log = Logger.getLogger(Dao.class);

    public String getInsertQuery() {
        StringBuffer sb = new StringBuffer("INSERT INTO ");

        try{
            sb.append(this.getClass().getSimpleName());
            log.info(sb.toString());

        }
        catch(Exception e){
            log.fatal(e.getMessage());
        }

        return sb.toString();
    }


    public void insert() {
       // String query =getInsertQuery();
       /* Connection c = getConnection();

        c.prepareStatement(query);
        */

    }


    public String selectTrack(String title) {
        StringBuffer ss = new StringBuffer("SELECT ");
        try{
            ss.append(this.getClass().getSimpleName());

            log.info(ss.toString());
        }
        catch (Exception e){
            log.fatal(e.getMessage());
        }
        return ss.toString();

    }

    public void update() {


    }

    public void delete() {

    }


}
