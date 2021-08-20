function car(licencia, conductor) {
    this.id;
    this.license = licencia;
    this.driver = conductor;
    this.passenger;
}
car.prototype.printDataCar = function()
{
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)

}