package lesson5;

public class DataParameter {

    private static final String PARAM_NAME = "data_param";
    private static long counter = 0;

    private final String entityId;
    private final long id;

    public DataParameter() {
        id = ++counter;
        entityId = PARAM_NAME + "@" + id;
    }

    public String getEntityId() {
        return entityId;
    }

    public long getId() {
        return id;
    }
}
