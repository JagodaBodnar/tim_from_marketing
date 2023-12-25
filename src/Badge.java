public class Badge {
    public String print(Integer id, String name, String department) {
        String idString = "[" + id + "]" + " - ";
        if(id == null){
            if(department == null){
                return name + " - OWNER";
            }
            return name + " - " + department.toUpperCase();
        }
        else if(department == null){
            return idString + name + " - OWNER";
        }

        return idString + name + " - " + department.toUpperCase();
    }
}
