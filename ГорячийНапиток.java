public class ГорячийНапиток extends Product {
  private int temperature;

  public ГорячийНапиток(String name, int volume, int temperature) {
      super(name, volume);
      this.temperature = temperature;
  }

  public int getTemperature() {
      return temperature;
  }

  @Override
  public String toString() {
      return "ГорячийНапиток{name='" + getName() + "', volume=" + getVolume() + ", temperature=" + temperature + '}';
  }
}
