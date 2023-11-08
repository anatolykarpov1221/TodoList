package todolist.menulist;

public enum Menulist {

    ADDN("Addnote",1),SEEALL("SeeallPost",2),DEL("DeleteByNumber",3),EX("GoOut",4);
           // pole
    private String action;
    private int punktnumber;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getPunktnumber() {
        return punktnumber;
    }

    public void setPunktnumber(int punktnumber) {
        this.punktnumber = punktnumber;
    }

    Menulist(String action, int punktumber) {
        this.action = action;
        this.punktnumber = punktumber;

    }

    @Override
    public String toString() {
        return "Menulist{" +
                "action='" + action + '\'' +
                ", punktnumber=" + punktnumber +
                '}';
    }

}
