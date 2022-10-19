package fundamentos;

/*
 * Import -> Traz classes extras do JDK
 * ou pacotes criado
 * 
 * Os import ficam fora de classes
 */
import java.util.Date;

public class Import {
  public static void main(String[] args) {
    /*
     * Java e extritamente envolvida com classes
     */
    String s = "Bom dia!";
    System.out.println(s);

    Date d = new Date();
    System.out.println(d);
  }
}
