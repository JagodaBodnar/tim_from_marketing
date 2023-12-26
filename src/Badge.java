public class Badge {
    public String print(Integer id, String name, String department) {
        if(id == null){
            if(department == null){
                return  String.format("%s - OWNER", name);
            }
            return  String.format("%s - %s ", name, department.toUpperCase());
        }
        else if(department == null){
            return String.format("[%s] - %s  - OWNER", id, name);
        }

        return String.format("[%s] - %s  - %s", id, name,department.toUpperCase());
    }
}
