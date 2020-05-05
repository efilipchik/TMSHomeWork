package Lesson9;

@Version(numberVersion = 7)
public class MyService {

    private String typeService;
    private int addressService;

    public MyService(String typeService, int addressService) {
        this.typeService = typeService;
        this.addressService = addressService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public int getAddressService() {
        return addressService;
    }

    public void setAddressService(int addressService) {
        this.addressService = addressService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyService that = (MyService) o;

        if (addressService != that.addressService) return false;
        return typeService.equals(that.typeService);
    }

    @Override
    public int hashCode() {
        int result = typeService.hashCode();
        result = result + addressService;
        return result;
    }

    private void thisClassInformation() {
        System.out.println("Это класс MyClass");
    }


}
