
import org.apache.commons.lang3.StringUtils;
import com.github.lalyos.jfiglet.FigletFont;

public class Main {

    public static void main(String[] args) {

        String texto = "me gustaria tener un metodo";

        String textoMayus = StringUtils.upperCase(texto);

        System.out.println(textoMayus);

        String asciiart = FigletFont.convertOneLine("alex");

        System.out.println(asciiart);
    }
}
