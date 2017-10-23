import org.junit.*;
import static org.junit.Assert.*;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Test1 {


    final static Logger log = Logger.getLogger(Test1.class);

    Singer s = new Singer();
    Track t = new Track();

    @Before @After
    public void initialSet(){
        s.setName("Arthur");
        s.setBand("metalica");
        s.setBirthYear(1990);
        t.setTitle("hand on the wind");
        t.setSinger("metalica2");


    }



    @Test
    public void initialSetTest(){

        assertEquals("Arthur", s.getName());
        assertEquals("metalica", s.getBand());
        assertEquals(1990, s.getBirthYear());
        assertEquals("hand on the wind", t.getTitle());
        assertEquals("metalica2",t.getSinger());
    }


    @Test
    public void getInsertQueryTest(){

        assertEquals("INSERT INTO Singer",s.getInsertQuery());
    }




}
