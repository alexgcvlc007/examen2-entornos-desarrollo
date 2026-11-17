package org.ieselgrao;

import net.datafaker.Faker;
import com.diogonunes.jcolor.ColoredPrinter;
import com.diogonunes.jcolor.Ansi;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
                .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.BLUE)
                .build();

        for (int i = 0; i < 10; i++) {
            String name = faker.name().fullName();
            String streetAddress = faker.address().streetAddress();
            cp.println("Nombre: " + name, Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.WHITE);
            cp.println("Dirección: " + streetAddress, Ansi.Attribute.NONE, Ansi.FColor.BLACK, Ansi.BColor.GREEN);
        }
    }
}
}