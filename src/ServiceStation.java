public class ServiceStation {

    private String modelName;
    private int wheelsCount;

    public ServiceStation(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void check(Interface vehicle){
        if (vehicle != null){
            vehicle.service();
        }
    }
}