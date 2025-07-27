package OOPS;

public class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear() {
    }

    public String toString() {
        return  ("Footwear{" +
                "footwearId=" + this.footwearId +
                ", footwearName='" + this.footwearName + '\'' +
                ", footwearType='" + this.footwearType + '\'' +
                ", price=" + this.price +
                '}');
    }

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
        System.out.println(this.toString());
    }

    public int getFootwearId() {
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
