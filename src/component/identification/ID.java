package component.identification;

public interface ID {
    String name = "A";
    String role = null;
    boolean currentStatus = true;
    String idKey = null;


    void setIdKey(String key);
    String getIdKey();
    String getName();

    void setName(String name);

    String getRole();

    void setRole(String role);

    boolean getCurrentStatus();

    void setCurrentStatus(boolean currentStatus);

}
