import java.util.ArrayList;
import java.util.List;

public class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
    private List<ГорячийНапиток> products = new ArrayList<>();

    public void addProduct(ГорячийНапиток product) {
        products.add(product);
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (ГорячийНапиток product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null; // Если продукт не найден
    }

    public static void main(String[] args) {
        // Инициализируем несколько горячих напитков
        ГорячийНапиток coffee = new ГорячийНапиток("Кофе", 250, 85);
        ГорячийНапиток tea = new ГорячийНапиток("Чай", 200, 75);

        // Инициализируем автомат с горячими напитками
        ГорячихНапитковАвтомат автомат = new ГорячихНапитковАвтомат();
        автомат.addProduct(coffee);
        автомат.addProduct(tea);

        // Получаем продукт из автомата
        Product requestedProduct = автомат.getProduct("Кофе", 250, 85);
        if (requestedProduct != null) {
            System.out.println("Продукт найден: " + requestedProduct);
        } else {
            System.out.println("Продукт не найден");
        }
    }
}
