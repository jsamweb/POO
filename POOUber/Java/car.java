class Car {
    Integer id;
    String license;
    account driver;
    private Integer passeger;

    public Car(String license, account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + " Name Driver: " + driver.name + "passeger: " + passeger);
    }

}