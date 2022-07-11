package interfacesAndAbstraction.birthdayCelebrations;

public class Robot implements Identifiable {
    private String id, model;

    Robot(String id, String model){
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getId() {
        return id;
    }
}