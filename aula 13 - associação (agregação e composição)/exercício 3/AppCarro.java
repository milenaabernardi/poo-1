public class AppCarro {
    public static void main(String[] args) {
        Bancos bancos1 = new Bancos("Audi");
        Bancos bancos2 = new Bancos("BYD");
        Bancos bancos3 = new Bancos("Volkswagen");

        Motor m1 = new Motor("2.0L TFSI");
        Carro c1 = new Carro("Audi", "A4 Sedan", "Audi", m1, bancos1);

        Motor m2 = new Motor("Elétrico 150kW");
        Carro c2 = new Carro("BYD", "Dolphin Mini", "BYD", m2, bancos2);

        Motor m3 = new Motor("1.4 TSI Turbo");
        Carro c3 = new Carro("Volkswagen", "Golf GTE", "Volkswagen", m3, bancos3);

        System.out.println(c1.getFabricante() + " " + c1.getMarca() + " " + c1.getModelo() + " " + c1.getMotor() + " " + c1.getBancos());
        System.out.println(c2.getFabricante() + " " + c2.getMarca() + " " + c2.getModelo() + " " + c2.getMotor() + " " + c2.getBancos());
        System.out.println(c3.getFabricante() + " " + c3.getMarca() + " " + c3.getModelo() + " " + c3.getMotor() + " " + c3.getBancos());
    }
}

