public class BlueDrug extends Drug {
    private String Size; // L M S
    private int AddMagic; // 120 80 50

    public BlueDrug(String size, int addMagic) {
        super(size);
        AddMagic = addMagic;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public void setAddMagic(int addMagic) {
        this.AddMagic = addMagic;
    }

    public String getSize() {
        return Size;
    }

    public int getAddMagic() {
        return AddMagic;
    }
}