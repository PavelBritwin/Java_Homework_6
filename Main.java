package Java_homework_6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> filter = new LinkedHashMap<>();
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP", "CZC985FG2", "Pavilion m6", 6, 500, 2, "Windows 10", 40000));
        laptops.add(new Laptop("HP", "CZC985FG3", "Pavilion g6", 8, 1000, 4, "Windows 11", 60000));
        laptops.add(new Laptop("Huawei", "CZC985FG4", "pvm5-e6", 8, 1000, 4, "Windows 11", 70000));
        laptops.add(new Laptop("Lenovo", "CZC985FG5", "eq-m6", 16, 1000, 8, "Windows 11", 800000));
        laptops.add(new Laptop("Lenovo", "CZC985FG6", "eq-m5", 8, 1000, 4, "Windows 10", 60000));
        laptops.add(new Laptop("Lenovo", "CZC985FG7", "lvv-3", 8, 500, 4, "Linux Ubuntu", 50000));
        laptops.add(new Laptop("Huawei", "CZC985FG8", "pvm5-e7", 4, 500, 2, "Windows 11", 40000));
        laptops.add(new Laptop("HP", "CZC985FG9", "Pavilion r8", 16, 2000, 8, "Windows 11", 100000));
        laptops.add(new Laptop("HP", "CZC985FH3", "Pavilion w8", 32, 2000, 16, "Linux Ubuntu", 140000));
        laptops.add(new Laptop("HP", "CZC985FH3", "Pavilion st", 16, 2000, 4, "Windows 11", 100000));

        Scanner scanner = new Scanner(System.in, "Cp866");
        Integer criterion = 0;
        String value = "";
        while (filter.size() < 6){
            System.out.println("Укажите критерий фильтрации:\n1 - vendor\n2 - ram\n3 - diskGb\n4 - cpuNumber\n5 - os\n6 - priceRub (all laptops less than price)\n7 - show Current List\n8 - exit");
            criterion = Integer.parseInt(scanner.nextLine());
            if (criterion != 7) {
                System.out.println("Укажите значение фильтрации: ");
                value = scanner.nextLine();
            }
            switch (criterion){
                case 1:
                    filter.put("vendor", value);
                    break;
                case 2:
                    filter.put("ram", value);
                    break;
                case 3:
                    filter.put("diskGb", value);
                    break;
                case 4:
                    filter.put("cpuNumber", value);
                    break;
                case 5:
                    filter.put("os", value);
                    break;
                case 6:
                    filter.put("priceRub", value);
                    break;
                case 7:
                    break;
                case 8:
                    return;
                default:
                    System.out.print("Такого критерия не существует!");
                    break;
            }
            System.out.println("Текущие критерии фильтрации: "+filter);
            List<Laptop> outputList = new ArrayList<>();
            outputList = laptops;
            for (int i = 0; i < outputList.size(); i++)
            {
                for (var o : filter.entrySet())
                {
                    if (o.getKey().equals("vendor")) {
                        if (!o.getValue().equals(outputList.get(i).getVendor())) {
                            outputList.remove(outputList.get(i));
                            i--;
                        }
                    }
                    if (o.getKey().equals("os")) {
                        if (!o.getValue().equals(outputList.get(i).getOs())){
                            outputList.remove(outputList.get(i));
                            i--;
                        }
                    }
                    if (o.getKey().equals("ram")) {
                        if (!((Integer.parseInt(o.getValue())) == (outputList.get(i).getRam()))){
                            outputList.remove(outputList.get(i));
                            i--;
                        }
                    }
                    if (o.getKey().equals("cpuNumber")) {
                        if (!((Integer.parseInt(o.getValue())) == (outputList.get(i).getCpuNumber()))){
                            outputList.remove(outputList.get(i));
                                i--;
                            }
                    }
                    if (o.getKey().equals("priceRub")) {
                        if (!((Integer.parseInt(o.getValue())) >= (outputList.get(i).getPriceRub()))) {
                            outputList.remove(outputList.get(i));
                            i--;
                        }   
                    }
                }
            }
            for (Laptop item : outputList){
                System.out.println(item.getVendor() +" "+ item.getModel() +" "+ item.getCpuNumber() +"/" + item.getRam() +"/" +item.getDiskGb() + " OS: " + item.getOs() + " price: " +item.getPriceRub());
            }
        }
        scanner.close();

    }

}
