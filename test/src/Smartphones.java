public class Smartphones extends Cellphone {

    String operativeSyst, memory;
    

    public Smartphones (String brand, String model, String color, String operativeSyst, String memory) {
        super(brand, model, color);
        this.operativeSyst=operativeSyst;
        this.memory=memory;
    
    }

    public String infoSmartphone() {
        String info = "Modelo: " + this.model;
        info += "\nMarca: " + this.brand;
        info += "\nColor: " + this.color;
        info += "\nSistema operativo: " + this.operativeSyst;
        info += "\nMemoria: " + this.memory;
        return info;
    }
}
