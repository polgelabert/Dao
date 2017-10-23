

 abstract class Dao {




    public void insert() {
     StringBuffer si =new StringBuffer("INSERT INTO ");
     si.append(this.getClass().getSimpleName());

     log.info(si.toString());


    }

    public void select() {
        StringBuffer ss = new StringBuffer("SELECT* FROM ");
                    ss.append(this.getClass().getSimpleName());
                    log.info(ss.toString());
    }

    public void update() {


    }

    public void delete() {

    }


}
