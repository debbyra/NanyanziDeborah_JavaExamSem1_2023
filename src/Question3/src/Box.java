//REG No.031
public class Box {
    //    attribute
    float width = 32;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public static void main(String[] args) {
//        instance of class Box
        Box obj = new Box();
//        get the width
        System.out.println("Old Value: "+obj.getWidth());
//        set to new width
         obj.setWidth(45);
        System.out.println("New Value: "+obj.getWidth());

    }
}

