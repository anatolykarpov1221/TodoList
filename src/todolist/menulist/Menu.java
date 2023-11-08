package todolist.menulist;

public class Menu {
    public static void main(String[] args) {
        System.out.println("====Menu=====");
        Menulist[] menu = Menulist.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+"-->"+menu[i].getAction());


        }
    }
    public static void printMenu(){
     System.out.println("====Menu=====");
           Menulist[] menu = Menulist.values();
           for (int i = 0; i < menu.length; i++) {
               System.out.println((i + 1) + "-->" + menu[i].getAction());


           }
   }
}
