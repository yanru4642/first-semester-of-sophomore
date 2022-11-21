public class RedDrug extends Drug {
    private String Size; // L M S
    private int AddLife; // 120 80 50

    public RedDrug(String size, int addLife) {
        super(size);
        AddLife = addLife;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public void setAddLife(int addLife) {
        this.AddLife = addLife;
    }

    public String getSize() {
        return Size;
    }

    public int getAddLife() {
        return AddLife;
    }
}