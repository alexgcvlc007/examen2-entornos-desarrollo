 
# Prueba práctica UD2. Dependencias en maven y git

- Crea un proyecto nuevo de IntelliJ con Maven. Crea un repositorio y haz un commit inicial.
- Añade la dependencia datafaker (net.datafaker) desde el repositorio de maven.
- Añade el siguiente código dentro del main, junto al import necesario para que se ejecute:


```java
Faker faker = new Faker();

for (int i = 0; i < 10; i++) {
    // Generar data
    String name = faker.name().fullName();
    String streetAddress = faker.address().streetAddress();

    // Mostrar data
    System.out.println("Nombre: " + name);
    System.out.println("Dirección: " + streetAddress);
}
```

- Haz un commit en una nueva rama data-faker.
- Vuelve a la rama principal. Desde aquí añadiremos la dependencia JCDP (java color debug printer) de com.diogonunes.
- Escribe y ejecuta este código en el main. Haz un commit en una nueva rama llamada "color-print".

```Java

ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
    .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.BLUE)
    .build();

for (int i = 0; i < 10; i++) {
    // Generar data
    String name = "Juan Juánez"
    String streetAddress = "Calle falsa, 123"

    // Mostrar data
    cp.println("Nombre: " + name, Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.WHITE);
    cp.println("Dirección: " + streetAddress, Ansi.Attribute.NONE, Ansi.FColor.BLACK, Ansi.BColor.GREEN); 
}
```

- Vuelve a la rama principal.
- Haz merge de la rama "data-faker"
- Haz merge de la rama "color-print". Soluciona los conflictos para que quede algo así:
```Java
Faker faker = new Faker();
ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
    .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.BLUE)
    .build();

for (int i = 0; i < 10; i++) {
    // Generar data
    String name = faker.name().fullName();
    String streetAddress = faker.address().streetAddress();

    // Mostrar data
    cp.println("Nombre: " + name, Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.WHITE);
    cp.println("Dirección: " + streetAddress, Ansi.Attribute.NONE, Ansi.FColor.BLACK, Ansi.BColor.GREEN); 
}
```

- Haz un ultimo commit solucionando conflictos si es necesario, y comprime el proyecto en un zip. Entregalo en aules.