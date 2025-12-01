package examenrecuperatorioPoo;

public class main {
    
  package examenrecuperatorioPoo;

public class main {

    public static void main(String[] args) {

        gestorEnvios envio = new gestorEnvios(4);

        EnvioLocal envioLocal1 = new EnvioLocal("01", "Jaco", 15000, 20);
        EnvioLocal envioLocal2 = new EnvioLocal("02", "Benito Camelás", 18000, 25);

        EnvioInternacional envioInternacional1 = new EnvioInternacional("033", "Rosa", 70000, 15000);
        EnvioInternacional envioInternacional2 = new EnvioInternacional("044", "Pepito", 45000, 12000);

        envio.agregarEnvio(envioLocal1);
        envio.agregarEnvio(envioLocal2);
        envio.agregarEnvio(envioInternacional1);
        envio.agregarEnvio(envioInternacional2);

        double total = 0;
    }
}

}
