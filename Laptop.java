package Java_homework_6;

public class Laptop {
    private String vendor;
    private String serialNumber;
    private String model;
    private Integer ram;
    private Integer diskGb;
    private Integer cpuNumber;
    private String os;
    private Integer priceRub;
    
    public Laptop(String vendor, String serialNumber, String model, Integer ram, Integer diskGb, Integer cpuNumber,
            String os, Integer priceRub) {
        this.vendor = vendor;
        this.serialNumber = serialNumber;
        this.model = model;
        this.ram = ram;
        this.diskGb = diskGb;
        this.cpuNumber = cpuNumber;
        this.os = os;
        this.priceRub = priceRub;
    }
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getRam() {
        return ram;
    }
    public void setRam(Integer ram) {
        this.ram = ram;
    }
    public Integer getDiskGb() {
        return diskGb;
    }
    public void setDiskGb(Integer hdd) {
        this.diskGb = hdd;
    }
    public Integer getCpuNumber() {
        return cpuNumber;
    }
    public void setCpuNumber(Integer cpuNumber) {
        this.cpuNumber = cpuNumber;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public Integer getPriceRub() {
        return priceRub;
    }
    public void setPriceRub(Integer priceRub) {
        this.priceRub = priceRub;
    }
    @Override
    public String toString() {
        return "Laptop [vendor=" + vendor + ", serialNumber=" + serialNumber + ", model=" + model + ", ram=" + ram
                + ", diskGb=" + diskGb + ", cpuNumber=" + cpuNumber + ", os=" + os + ", priceRub=" + priceRub + "]";
    }
    
    
    }