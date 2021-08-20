class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new account("Andres Herrera", "AND123"), "ford","Melguebo");
        uberX.passeger = 4;
        uberX.printDataCar();

        // Car car2 = new Car("QWE567", new account("Andrea Herrera", "ANDA876"));
        // car2.passeger = 3;
        // car2.printDataCar();
    }
}