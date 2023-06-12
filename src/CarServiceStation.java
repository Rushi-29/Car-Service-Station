import java.util.HashMap;
import java.util.Map;

class CarServiceStation {
    private Map<String, Integer> hatchbackPrices;
    private Map<String, Integer> sedanPrices;
    private Map<String, Integer> suvPrices;

    public CarServiceStation() {
        hatchbackPrices = new HashMap<>();
        hatchbackPrices.put("BS01", 2000);
        hatchbackPrices.put("EF01", 5000);
        hatchbackPrices.put("CF01", 2000);
        hatchbackPrices.put("BF01", 1000);
        hatchbackPrices.put("GF01", 3000);

        sedanPrices = new HashMap<>();
        sedanPrices.put("BS01", 4000);
        sedanPrices.put("EF01", 8000);
        sedanPrices.put("CF01", 4000);
        sedanPrices.put("BF01", 1500);
        sedanPrices.put("GF01", 6000);

        suvPrices = new HashMap<>();
        suvPrices.put("BS01", 5000);
        suvPrices.put("EF01", 10000);
        suvPrices.put("CF01", 6000);
        suvPrices.put("BF01", 2500);
        suvPrices.put("GF01", 8000);
    }

    public int calculateBill(String carType, String[] serviceCodes) {
        int totalBill = 0;
        Map<String, Integer> carPrices = getCarPrices(carType);

        for (String serviceCode : serviceCodes) {
            if (carPrices.containsKey(serviceCode)) {
                totalBill += carPrices.get(serviceCode);
            }
        }

        return totalBill;
    }

    private Map<String, Integer> getCarPrices(String carType) {
        if (carType.equals("Hatchback")) {
            return hatchbackPrices;
        } else if (carType.equals("Sedan")) {
            return sedanPrices;
        } else if (carType.equals("SUV")) {
            return suvPrices;
        } else {
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}