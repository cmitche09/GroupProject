import java.util.ArrayList;

public class Egg implements IProduce, IEdible{

    private int num;
    private String color;


    public Egg(){}
    public Egg(int num, String color) {
        this.num = num;
        this.color = color;
    }

    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public String getName() {
        return num+" Eggs,"+" type: " + color;
    }

    @Override
    public boolean isHarvested() {
        return false;
    }

    @Override
    public boolean getHarvested() {
        return false;
    }

    @Override
    public void setHarvested(boolean harvested) {

    }

    @Override
    public boolean isFertilized() {
        return false;
    }



    @Override
    public boolean getFertilized() {
        return false;
    }

    @Override
    public void setFertilized(boolean fertilized) {

    }

    @Override
    public boolean hasBeenHarvested() {
        return false;
    }

    @Override
    public boolean hasBeenHarvested(ArrayList<CropRow> produces) {
        return false;
    }

    @Override
    public boolean hasBeenFertilized(ArrayList<CropRow> produces) {
        return false;
    }


    @Override
    public String toString() {
        return num+" Eggs,"+" type: " + color;
    }
}
