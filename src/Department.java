import java.util.Comparator;

public class Department {

    public int departmentId;
    public String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public static Comparator<Department> departID=new Comparator<Department>() {
        @Override
        public int compare(Department d1, Department d2) {
            int departmentId1=d1.getDepartmentId();
        int departmentId2=d2.getDepartmentId();
return departmentId1-departmentId2;

        }};
    public static Comparator<Department> departName=new Comparator<Department>() {
        @Override
public int compare(Department d1,Department d2){
            String DepartmentName1=d1.getDepartmentName();
            String DepartmentName2=d2.getDepartmentName();
            return DepartmentName1.compareTo(DepartmentName2);

        }
    };
    public String toString(){
        return "[departmentId="+departmentId+",name="+departmentName+"]";
    }

}


